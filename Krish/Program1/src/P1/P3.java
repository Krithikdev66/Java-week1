package P1;

public class P3 {
    static void checkPin(int n) throws InvaildPinException
    {
        if(n!=1980){
            throw new InvaildPinException("Invaild PIN");
        }else{
            System.out.println("Valid PIN");
        }
    }
    public static void main(String[] args) {

        try {
            checkPin(1000);
        } catch (InvaildPinException e) {
            System.out.println(e.getMessage());
        }
    }
}
