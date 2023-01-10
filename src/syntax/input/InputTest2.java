package syntax.input;

import java.util.*;

public class InputTest2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Сколько денег тебе нужно для выхода на пенсию? ");
        double goal = in.nextDouble();

        System.out.print("На какую сумму ты готов пополнять счет ежегодно? ");
        double payment = in.nextDouble();

        System.out.print("Какова твоя ежегодная ставка (в %): ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("Для достижения цели в " + goal + " рублей, тебе потребуется " + years + " лет.");
    }
}

