import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean onlyN1Positive = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean onlyN2Positive = n1 <= 0 && n2 > 0 && n3 <= 0;
        boolean onlyN3Positive = n1 <= 0 && n2 <= 0 && n3 > 0;

        System.out.println(onlyN1Positive || onlyN2Positive || onlyN3Positive);
    }
}