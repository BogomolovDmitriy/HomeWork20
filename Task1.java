import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        int t = n * (n + 1) / 2;
        System.out.printf("Введенное число соответствует треугольному числу %d", t);
        iScanner.close();
    }
    
}