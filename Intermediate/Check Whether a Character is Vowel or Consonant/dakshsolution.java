package daksh;

public class Alphachecker {

    public static void checker(String aplha){
        String tmp=aplha.toLowerCase(); // changed the user input to the lowercase to avoid any conflicts with the cases..
        if (tmp.equals("a") || tmp.equals("e") || tmp.equals("i") || tmp.equals("o") || tmp.equals("u") ){
            System.out.println("The input letter is Vowel");
        }else {
            System.out.println("The input letter is consonant");
        }
    }
    public static void main(String[] args){
        Alphachecker alphachecker=new Alphachecker();
        alphachecker.checker("a");
    }
}
