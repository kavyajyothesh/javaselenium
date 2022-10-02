package day2;

public class double_calculator {
    double addNumber(double x,double y){
        double sum=x+y;
        return sum;
    }
    double subtraction(double x,double y){
        double sub=x-y;
        return sub;
    }
    double multiplication(double x,double y){
        double mul=x*y;
        return mul;
    }
    double division(double x,double y) {
        double div = x / y;
        return div;
    }
    public static void main(String[] args) {
        calculator kavya = new calculator();
        double sum = kavya.addNumber(8, 9);
        System.out.println("sum  of two numbers " + sum);
        double sub = kavya.subtraction(10, 9);
        System.out.println("subtraction of two numbers " + sub);
        double mul = kavya.multiplication(10, 9);
        System.out.println("multiplication  of two numbers " + mul);
        double div = kavya.division(5,6);
        System.out.println("div of two numbers" + div);

    }
}