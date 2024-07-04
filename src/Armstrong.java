import java.util.ArrayList;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for armstrong number");
        String n = sc.nextLine();
        int s = n.length();
        int sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < s; i++){
            sum+=(int)Math.pow(Integer.parseInt(String.valueOf(n.charAt(i))),s);
        }
        if(String.valueOf(sum).equals(n)){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
