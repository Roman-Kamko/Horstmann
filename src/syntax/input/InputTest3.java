package syntax.input;

import java.util.Scanner;

public class InputTest3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("На какую сумму ты готов пополнять счет ежегодно? ");
        double payment = in.nextDouble();

        System.out.print("Какова твоя ежегодная ставка (в %): ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;
        String input;

        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
            System.out.printf("После %d лет твой баланс %,.2f%n", years, balance);
            System.out.println("Готов выйти на пенсию? (Y/N) ");
            input = in.next();
        }
        while (input.equals("N"));
    }
}

