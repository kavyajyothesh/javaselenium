package day2;

public class long_calculator {
    long addNumber(long x, long y) {
        long sum = x + y;
        return sum;
    }

    long subtraction(long x, long y) {
        long sub = x - y;
        return sub;
    }

    long multiplication(long x, long y) {
        long mul = x * y;
        return mul;
    }

    long division(long x, long y) {
        long div = x / y;
        return div;
    }

    public static void main(String[] args) {
        calculator kavya = new calculator();
        long sum = kavya.addNumber(8, 9);
        System.out.println("sum  of two numbers " + sum);
        long sub = kavya.subtraction(10, 9);
        System.out.println("subtraction of two numbers " + sub);
        long mul = kavya.multiplication(10, 9);
        System.out.println("multiplication  of two numbers " + mul);
        long div = (long) kavya.division(5, 6);
        System.out.println("div of two numbers" + div);

    }
}