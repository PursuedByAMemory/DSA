public class LinkedList {
    public static void main(String[] args){
        LinkedList LL1 = new LinkedList(1);
        LL1.append(2);
        LL1.append(3);
        LL1.append(4);
        LL1.insert(10,2);
        LL1.remove(2);
        LL1.print();
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    Node head;
    Node tail;
    int length;
    LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void print(){
        Node temp = head;
        for(int i = 0; i < length; i++){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            //Node temp = head;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        if(length==0){
            return null;
        }else{
            Node temp = head;
            head = head.next;
            temp.next=null;
            length--;
            if(length==0){
                head=null;
                tail=null;
            }
            return temp;
        }
    }
    public Node removeLast(){
        if(length == 0){
            return null;
        }else{
            Node temp = head;
            Node pre = head;
            while(temp.next!=null){
                pre = temp;
                temp=temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if(length==0){
                head = null;
                tail = null;
            }
            return temp;
        }
    }
    public boolean insert(int value, int index){
        if(index<0 || index > length){
            return false;
        }else{
            Node newNode = new Node(value);
            Node temp= head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            newNode.next=temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
    }
    public boolean remove(int index){
        if(index<0 || index > length){
            return false;
        }else{
            Node temp = head;
            Node pre = head;
            for(int i = 0; i < index; i++){
                pre = temp;
                temp=temp.next;
            }
            pre.next = temp.next;
            temp.next = null;
            length--;
            return true;
        }
    }
}
