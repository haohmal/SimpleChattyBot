import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean cond1 = a + b > c;
        boolean cond2 = a + c > b;
        boolean cond3 = b + c > a;

        if (cond1 && cond2 && cond3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}