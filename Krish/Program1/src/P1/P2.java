package P1;
public class P2 {
static void checkAge(int age) throws InvalidNumberException
{
    if(age<18){
        throw new InvalidNumberException("Age cannot be less than 18");
    }else{
    System.out.println("Valid Age");
    }
}
public static void main(String[] args) {

    try{
        checkAge(10);
    }catch (InvalidNumberException e){
        System.out.println(e.getMessage());
    }

}

}
