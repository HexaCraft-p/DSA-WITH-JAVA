import java.util.Scanner;

class Complex{
    static int i = -1;

    int sum(int a, int b){
        return a + (b*i);
    }

    int difference(int a, int b){
        return a - (b * i);
    }

    int product(int a, int b){
        return a * (b * i);
    }
}

public class ComplexSum_Diff_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        Complex c = new Complex();
        int Sum = c.sum(num1, num2);
        int Diff = c.difference(num1, num2);
        int Pro = c.product(num1, num2);
        System.out.println("Sum of 2 complex number is: "+Sum);
        System.out.println("Difference of 2 complex number is: "+Diff);
        System.out.println("Product of 2 complex number is: "+Pro);

    }
}

