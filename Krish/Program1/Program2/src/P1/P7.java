package P1;

public class P7 {
    public static void main(String[] args) {
        String s1="Apple";
        String res="";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);

            if(ch>=65&&ch<=91){
                ch=(char)(ch+32);
                res+=ch;
            }else {
                ch=(char)(ch-32);
               }
        }
        System.out.println(res);
    }
}
