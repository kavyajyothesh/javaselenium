package day2;

public class short_calculator {
    short addNumber(short x,short y){
        short sum= (short) (x+y);
        return sum;
    }
    short subtraction(short x,short y){
        short sub= (short) (x-y);
        return sub;
    }
    short multiplication(short x,short y){
        short mul= (short) (x*y);
        return mul;
    }
    short division(short x,short y) {
        short div = (short) (x / y);
        return div;
    }
    public static void main(String[] args) {
        calculator kavya = new calculator();
        short sum = (short) kavya.addNumber(8, 9);
        System.out.println("sum  of two numbers " + sum);
        short sub = (short) kavya.subtraction(10, 9);
        System.out.println("subtraction of two numbers " + sub);
        short mul = (short) kavya.multiplication(10, 9);
        System.out.println("multiplication  of two numbers " + mul);
        short div = (short) kavya.division(5,6);
        System.out.println("div of two numbers" + div);

    }
}