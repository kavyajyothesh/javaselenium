package day2;

public class calculator {
    int addNumber(int x,int y){
        int sum=x+y;
        return sum;
    }
    int subtraction(int x,int y){
        int sub=x-y;
        return sub;
    }
    int multiplication(int x,int y){
        int mul=x*y;
        return mul;
    }    float division(float x,float y) {
        float div = x / y;
        return div;
    }
     public static void main(String[] args) {
         calculator kavya = new calculator();
         int sum = kavya.addNumber(8, 9);
         System.out.println("sum  of two numbers " + sum);
         int sub = kavya.subtraction(10, 9);
         System.out.println("subtraction of two numbers " + sub);
         int mul = kavya.multiplication(10, 9);
         System.out.println("multiplication  of two numbers " + mul);
         float div = kavya.division(5,6);
         System.out.println("div of two numbers" + div);

     }
}
