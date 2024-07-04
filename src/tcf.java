public class tcf {
    public static void main(String[] args){
        try{
            int result = 10/0;
        } catch(ArithmeticException e){
            System.out.println("You divided by zero, dont do that");
        }
        catch(Exception e){
            System.out.println("Caught an exception");
        } finally{
            System.out.println("This will always execute");
        }
    }
}
