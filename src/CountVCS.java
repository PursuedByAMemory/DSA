import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CountVCS {
    public static void main(String[] args){
        System.out.println("Enter the string you want to know the count of vowels, consonants and spaces off");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern con = Pattern.compile("[A-Z&&[^AEIOU]]", Pattern.CASE_INSENSITIVE);
        Pattern vow = Pattern.compile("[AEIOU]", Pattern.CASE_INSENSITIVE);
        Pattern spa = Pattern.compile(" ", Pattern.CASE_INSENSITIVE);
        Matcher mCons = con.matcher(s);
        Matcher mVow = vow.matcher(s);
        Matcher mSpa = spa.matcher(s);
        int cons = 0;
        int vows = 0;
        int spas = 0;
        while(mCons.find()){
            cons+=1;
        }
        while(mVow.find()){
            vows+=1;
        }
        while(mSpa.find()){
            spas+=1;
        }
        System.out.println("Consonants: "+cons);
        System.out.println("Vowels: "+vows);
        System.out.println("Spaces: "+spas);
    }
}
