import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < number; i++) {
            int next = scanner.nextInt();
            if (next % 4 == 0 && next > result) {
                result = next;
            }
        }
        System.out.println(result);
    }
}