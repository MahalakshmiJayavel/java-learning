public class LogicalOperators {
    public static void main(String[] args) {
        int a= 10;
        int b=15;
        System.out.println(a>15 && b>15); //returns true when both the conditions are true
        System.out.println(a>15 || b>10);//returns false when both the condition is false
        System.out.println(!(a>15));//returns true when the condition is false
    
    }
}