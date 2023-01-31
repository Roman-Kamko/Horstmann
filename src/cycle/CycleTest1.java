package cycle;

import java.util.*;

public class CycleTest1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("blastoff");

        //Вычисли шанс выйграть в лотерее в которой нужно угадать 6 номеров из 50
        int lotteryOdds = 1;
        for (int i = 1; i <= 6; i++) {
            lotteryOdds = lotteryOdds * (50 - i + 1) / i;
        }
        System.out.println("шанс выйграть в лотерею 1 к " + lotteryOdds);

        int goal = 1_000_000;
        int balance = 0;
        int payment = 10_000;
        int interestRate = 10;
        int years = 0;
        while (years <= 100) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            if (balance >= goal) break;
            years++;
        }
        System.out.println("год " + years + ", баланс " + balance);

        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 100; count++) {
            System.out.println("Введите номер:");
            int n = in.nextInt();
            if (n < 0) continue;
            sum += n;
            System.out.println(sum);
        }
    }
}
