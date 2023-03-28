import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String word = scanner.next();
        int arg1 = scanner.nextInt();
        int arg2 = scanner.nextInt();

        System.out.println(word.substring(arg1, arg2 + 1));
    }
}