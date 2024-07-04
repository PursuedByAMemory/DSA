import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class LeetCode2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        LeetCode2 lt2= new LeetCode2();
        HashSet<Character> result = lt2.leetCodeFunc2(s);
        if(result.isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println(result);
        }
    }

    public HashSet<Character> leetCodeFunc2(String str){
        String arr[] = new String[str.length()];
        ArrayList<Character> al = new ArrayList<>();
        HashSet<Character> noDups = new HashSet<>();
        for(char c: str.toCharArray()){
            al.add(c);
        }
        for(int i =0;i<al.size();i++){
            noDups.add(al.get(i));
        }
        for(int i = 0; i < al.size();i++){

        }
        return noDups;
    }
}
