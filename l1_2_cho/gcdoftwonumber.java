package l1_2_cho;
import java.util.Scanner;
class gcdoftwonumber{
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = gcd(a, b);
        System.out.println("GCD of the two numbers: " + x); 
    }
}
