import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        System.out.println(n + " ");
        while  (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n + " ");
            } else {
                n = 3 * n + 1;
                System.out.println(n + " ");
            }
        }
    }
}