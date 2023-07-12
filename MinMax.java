
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz :");
        int n = input.nextInt();

        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Sayıyı Giriniz : ");
            number[i] = input.nextInt();
        }

        int maxNumber = number[0];
        int minNumber = number[0];

        for (int i = 0; i < n; i++) {
            if (number[i] > maxNumber) {
                maxNumber = number[i];
            }
            if (number[i] < minNumber) {
                minNumber = number[i];
            }
        }

        System.out.println("En büyük sayı :" + maxNumber);
        System.out.println("En küçük sayı :" + minNumber);

    }
}
