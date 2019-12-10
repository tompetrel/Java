/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//5. In ra output nội dung sau đây:
//<!DOCTYPE html>
//<html>
//    <head>
//        <title>Add Class jQuery</title>
//        <meta charset="UTF-8">
//        <script>            
//            function clickEvent()
//            {
//                var element = $('.container');
//                alert(element.length);
//            }
//        </script>
//    </head>
//    <body>
//        <div class="container">
//            Container
//        </div>
//    </body>
//</html>
package session03;

/**
 *
 * @author TAI
 */
public class session03_baitap05 {

    public static void main(String[] args) {
        System.out.println("<!DOCTYPE html>");
        System.out.println("<html>");
        System.out.println("\t<head>");
        System.out.println("\t\t<title>Add Class jQuery</title>");
        System.out.println("\t\t<meta charset=\"UTF-8\">");
        System.out.println("\t\t<script>");
        System.out.println("\t\tfunction clickEvent()");
        System.out.println("\t\t{");
        System.out.println("\t\t\tvar element = $('.container');");
        System.out.println("\t\t\talert(element.length);");
        System.out.println("\t\t}");
        System.out.println("\t\t</script>");
        System.out.println("\t</head>");
        System.out.println("\t<body>");
        System.out.println("\t\t<div class=\"container\">");
        System.out.println("\t\t\tContainer");
        System.out.println("\t\t</div>");
        System.out.println("\t</body>");
        System.out.println("</html>");
    }
}
