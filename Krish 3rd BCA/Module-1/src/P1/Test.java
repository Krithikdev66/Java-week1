package P1;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //Input and Output
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the student name:");
        String name=s.next();
        System.out.println("Enter the student age:");
        int age=s.nextInt();
        System.out.println("Enter the student branch:");
        String branch=s.next();
        System.out.println("Enter the student usn:");
        String usn=s.next();
        System.out.println("Enter the student cgpa:");
        String cgpa=s.next();
        System.out.println(name);
        System.out.println(age);
        System.out.println(branch);
        System.out.println(usn);
        System.out.println(cgpa);

    }
}
