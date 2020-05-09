/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 *
 * @author TAI
 */
public class Digital_Signature {

    private static void taoKey() {
        try {
            SecureRandom sr = new SecureRandom();
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("DSA");
            kpg.initialize(1024, sr);
            KeyPair keys = kpg.generateKeyPair();

            //Save private key
            PrivateKey privateKey = keys.getPrivate();
            FileOutputStream fos = new FileOutputStream("priKey.bin");
            fos.write(privateKey.getEncoded());
            fos.close();

            //Save public key
            PublicKey publicKey = keys.getPublic();
            fos = new FileOutputStream("pubKey.bin");
            fos.write(publicKey.getEncoded());
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void chuKy() {
        try {
            //Nap private tu file
            FileInputStream fis = new FileInputStream("priKey.bin");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            fis.close();

            //Ky so(sign) --
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(b);
            KeyFactory keyFactory = KeyFactory.getInstance("DSA");
            PrivateKey privateKey = keyFactory.generatePrivate(spec);

            //Tao doi tuong signer
            Signature signer = Signature.getInstance("DSA");
            signer.initSign(privateKey, new SecureRandom());

            //Chon file de thuc hien chu ky so
            fis = new FileInputStream("test.docx");
            byte[] bFile = new byte[fis.available()];

            //chen message vao doi tuong signer
            signer.update(bFile);
            byte[] bSign = signer.sign();

            //Luu chu ky
            FileOutputStream fos = new FileOutputStream("dsa");
            fos.write(bSign);
            System.out.println("Sign document successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void kiemTra() {
        try {
            // Nạp public key từ file
            FileInputStream fis = new FileInputStream("pubKey.bin");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            fis.close();

            // Tạo public key
            X509EncodedKeySpec spec = new X509EncodedKeySpec(b);
            KeyFactory factory = KeyFactory.getInstance("DSA");
            PublicKey pubKey = factory.generatePublic(spec);

            // Khởi tạo đối tượng Signature
            Signature s = Signature.getInstance("DSA");
            s.initVerify(pubKey);

            fis = new FileInputStream("test.docx");
            byte byteFile[] = new byte[fis.available()];
            fis.close();

            // Nạp message vào đối tượng Signuture
            s.update(byteFile);

            // Kiểm chứng chữ ký trên Message
            // Nạp chữ ký signature từ file
            fis = new FileInputStream("dsa");
            byte[] bsign = new byte[fis.available()];
            fis.read(bsign);
            fis.close();

            // Kết quả kiểm chứng
            boolean result = s.verify(bsign);
            if (result == true) {
                System.out.println("Message is verified");
            } else {
                System.out.println("Message isn't verified");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
//        taoKey(); // Khong Run taoKey 2 lan
//        chuKy();
        kiemTra();
    }

}
