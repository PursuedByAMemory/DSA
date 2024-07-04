import java.util.Arrays;
import java.util.Scanner;
public class LeetCode1 {
    public static void main(String[] args){
        System.out.println("Size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        LeetCode1 lt1 = new LeetCode1();
        int result[] = lt1.leetCode1Func(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] leetCode1Func(int nums[], int target){
        int ans[] = null;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if((nums[i] + nums[j] == target) && i!=j){
                    ans = new int[]{j,i};
                }
            }
        }
        return ans;
    }
}
