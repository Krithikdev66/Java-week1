package P1;

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        String s = "Java";
        String sr[] = s.split("a");
        System.out.println(Arrays.toString(sr));
        String s2 = "Java@gmail.com";
        String a[] = s2.split("@");
        System.out.println(Arrays.toString(a));
        String s3 = "Java@gmail.com";
        System.out.println(s3.replace("gmail.com", "nitte.edu.in"));
        String s4 = "Java Python C++ Java";
        System.out.println(s4.replaceFirst("Java", "C"));
        String s5 = "Java";
        System.out.println(s5.replaceFirst("J", "j"));
        String s6 = "123-456-789";
        System.out.println(s6.replace("-", ""));
        String s7 = "<p>Hello</p><p>World</p>";
        System.out.println(s7.replace("<p>", "").replace("</p>", ""));
        String p = "Java";
        int q = 10;
        System.out.println(p + q);
        String d[] = {"Java", "Python", "C++"};
        System.out.println(String.join("-", d));
        String p1 = "Java";
        System.out.println(p1.matches("^[A-Z].*"));
        String p2 = "krithik@10";
        System.out.println(p2.matches(".*[^A-Z,a-z,0-9].*"));
        String p3 = "Java#123";
        System.out.println(p3.replaceAll("[^A-Z,a-z,0-9]", " "));
        String p4 = "Java123";
        System.out.println(p4.replaceAll("\\d", " "));
        String name = "Aston Robert DMello";
        int p5 = name.indexOf(" ") + 1;
        int p6 = name.lastIndexOf(" ");
        System.out.println(name.substring(p5, p6));
        String n = "Java@gmail.com";
        System.out.println(n.substring(n.indexOf("@")));
        String p7 = "15451351";
        System.out.println(p7.matches("^[0-9].*"));
        String p8 = "Java&546";
        System.out.println(p8.replaceAll("\\d", " "));
        String p9 = "Java123456#";
        if (p9.length() > 10 && p9.matches(".*[^A-Z,a-z,0-9].*") && p9.matches(".*[A-Z,a-z,0-9].*")) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
        String email = "java@gmail.com";
        if ((Arrays.toString(email.split("@")).length() > 2)&&(Arrays.toString(email.split(".")).length() > 2)) {
            //if (Arrays.toString(email.split(".")).length() > 2) {
                System.out.println("Invalid ");
            } else {
                System.out.println("valid ");
            }


        //System.out.println(Arrays.toString(email.split("@")));


    }

}