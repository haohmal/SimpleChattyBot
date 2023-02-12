import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(text.substring(n,++m));
    }
}