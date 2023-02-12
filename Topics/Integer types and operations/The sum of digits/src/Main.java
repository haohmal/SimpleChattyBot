import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = n / 100;
        n %= 100;
        result += n / 10;
        result += n % 10;

        System.out.println(result);
    }
}