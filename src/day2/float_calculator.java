package day2;

public class float_calculator {
    float addNumber(float x,float y){
        float sum=x+y;
        return sum;
    }
    float subtraction(float x,float y){
        float sub=x-y;
        return sub;
    }
    float multiplication(float x,float y){
        float mul=x*y;
        return mul;
    }    float division(float x,float y) {
        float div = x / y;
        return div;
    }
    public static void main(String[] args) {
        calculator kavya = new calculator();
        float sum = kavya.addNumber(8, 9);
        System.out.println("sum  of two numbers " + sum);
        float sub = kavya.subtraction(10, 9);
        System.out.println("subtraction of two numbers " + sub);
        float mul = kavya.multiplication(10, 9);
        System.out.println("multiplication  of two numbers " + mul);
        float div = kavya.division(5,6);
        System.out.println("div of two numbers" + div);

    }
}
