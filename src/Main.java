public class Main {
    public static void main(String[] args) {
//        BST b = new BST();
//
//        b.insert(2);
//        b.insert(1);
//        b.insert(3);
//
//        System.out.println("Root: " + b.getRoot().value);
//        System.out.println("Root->Left: " + b.getRoot().left.value);
//        System.out.println("Root->Right: " + b.getRoot().right.value);
//        System.out.println(b.exists(1));
//        System.out.println("Commit");

        int[] arr = {1,1,2,2,3};
        int count = 0;
        for (int i = 0; i <arr.length + 1; i++) {
            if(arr[i] == arr[i + 1]) {
                if(arr[i] <= arr[i + 1]) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}