import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x");
        double x = scan.nextDouble();
        if (Math.abs(x) < 1) {
            System.out.println("Введите n");
            double n = scan.nextDouble();
            double sum = 0;
            double res = 0;

            for(double i = 0; i <= n; ++i) {
                sum += Math.pow(x, 2 * i + 1) / (2 * i + 1);
            }

            System.out.printf("Резултьтат=%f", sum);
        }
        else {
            System.out.println("x не удовлетворяет условию");
        }

    }
}