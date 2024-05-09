public class BST {
    public Node root;
    class Node{
        Node right;
        Node left;
        int value;
        Node(int value){
            this.value = value;
        }
    }

    public Node getRoot(){
        return root;
    }

    public boolean insert(int value) {
        Node nn1 = new Node(value);
        if (root == null) {
            root = nn1;
            return true;
        }
        Node temp = root;
        while (true) {
            if(nn1.value == temp.value){
                return false;
            }
            if(nn1.value < temp.value){
                if(temp.left == null){
                    temp.left = nn1;
                    return true;
                }
                temp = temp.left;
            }else{
                if(temp.right == null){
                    temp.right = nn1;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean exists(int value){
        Node temp = root;
        while(temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else{        // if (value == temp.value)
                return true;
            }
        }
        return false;
    }

}
