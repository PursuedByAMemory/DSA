public class Stack {
    public static void main(String[] arg){
        Stack s1 = new Stack(1);
        s1.push(2);
        s1.push(3);
        s1.print();
    }
    public void print(){
        Node temp = top;
        for(int i = 0; i < length;i++){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public class Node{
        Node next;
        int value;
        Node(int value){
            this.value = value;
        }
    }
    Node top;
    int length;
    Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        length = 1;
    }
    public Node pop(){
        if(length == 0){
            return null;
        }else {
            Node temp = top;
            top = top.next;
            temp.next = null;
            length--;
            if(length == 0){
                top = null;
            }
            return temp;
        }
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(length == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
            length++;
        }
    }
}
