package P1;

public class P1 {
 static void divide(int a,int b) throws ArithmeticException
 {
     if(b==0){
         throw new ArithmeticException("Cannot divide by Zero");
     }
     System.out.println("ans:"+(a/b));
 }
 public static void main(String[] args) {
        int a=10,b=0;
        try{
           divide(a,b);
           // System.out.println("Bye");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Hello");
        }
    }
}
