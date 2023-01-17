import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest1 {
    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);

        //System.out.print("Сколько чисел в лотерее нужно угадать? ");
        //int k = in.nextInt();

        //System.out.print("Какое максимальное число в лотерее можно выбрать? ");
        //int n = in.nextInt();
        int k = 6;
        int n = 49;

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            //System.out.println(Arrays.toString(numbers));
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);                               // генерируем случайное число от 0 до (n - 1)
            //System.out.println(r);
            result[i] = numbers[r];                                          // присвоение индексу из массива result случайный номер индекса из массива number (r + 1)
            numbers[r] = numbers[n - 1];                                     //
            n--;                                                             // чтобы не было повторения чисел
            //System.out.println(Arrays.toString(result));
        }

        //Arrays.sort(result);
        System.out.println("Получили следующую комбинацию. Надеюсь тебе повезло!)");
        for (int r : result) {
            System.out.println(r);
        }

        System.out.println("---------------------------------------------");

        int[] a = {5, 7, 3, 9, 1, 4};
    }
}
