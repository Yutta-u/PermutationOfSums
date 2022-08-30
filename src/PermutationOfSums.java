import java.util.Scanner;

public class PermutationOfSums {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int sum = a + b;
        int sum1 = b + c;
        int sum2 = a + c;

        if (sum == c) {
            System.out.println("YES");
        } else if (sum1 == a) {
            System.out.println("YES");
        } else if (sum2 == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
