import java.util.Scanner;
import java.util.ArrayList;
public class Palindrome {
    public static void main(String[] args){
//        System.out.println("Size?");
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        int arr[] = new int[s];
//        System.out.println("Elements?");
//        for(int i = 0; i < s; i++){
//            arr[i] = sc.nextInt();
//        }
//
        System.out.println("Enter a number to check for palindrome");
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        ArrayList<Character> al = new ArrayList<>();
        for(int i = 0; i < check.length(); i++){
            al.add(check.charAt(i));
        }
        String rev = "";
        while(!al.isEmpty()){
            rev+=al.remove(al.size()-1);
        }
        if(check.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
