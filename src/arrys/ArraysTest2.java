package arrys;

public class ArraysTest2 {
    public static void main(String[] args) {

        final double STARTRATE = 10;
        final int NRATE = 6;
        final int NYEARS = 10;

        // Установим процетные ставки
        double[] interestRate = new double[NRATE];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100.0;
        }

        double[][] balances = new double[NYEARS][NRATE];

        // Установим исходные остатки на счету
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 25_000;
        }

        // Рассчитаем проценты на следующие годы
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {

                // Остатки на счету за прошлые год
                double oldBalance = balances[i - 1][j];

                // Расчет процента
                double interest = oldBalance * interestRate[j];

                // Расчет остатков на счеу в текущем году
                balances[i][j] = oldBalance + interest;
            }
        }

        // Вывод ряда процентных ставок
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }
        System.out.println();

        // Вывод таблицы статков на счету
        for (double[] row : balances) {

            // Вывод строки таблицы
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}
