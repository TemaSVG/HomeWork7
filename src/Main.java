public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int money = 0;
        int month = 1;
        while (money <= 2_459_000) {
            money += 15000;
            month++;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + money + " рублей");
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int populationCountryY = 12_000_000;
        for (int j = 1; j <= 10; j++) {
            populationCountryY += populationCountryY / 1000 * (17 - 8);
            System.out.println("Год " + j + ", численость населения составляет " + populationCountryY);
        }
        System.out.println("Задача 4 и 5");
        double depositAmount = 15000;
        int monthOfDeposit = 1;
        while (depositAmount <= 12_000_000) {
            monthOfDeposit++;
            depositAmount *= 1.07;
            if (monthOfDeposit % 6 == 0) System.out.printf("Месяц %s накопленя %.2f\n", monthOfDeposit, depositAmount);
        }
        System.out.println("Задание 6");
        double originalAmount = 15000;
        int investmentTime = 12*9;
        for (int j = 1; j <= investmentTime; j++) {
            originalAmount *= 1.07;
            if (j % 6 == 0) System.out.printf("Месяц %s накопленя %.2f\n", j, originalAmount);
        }
        System.out.println("Задание 7");
        int friday = 5;
        for (int k = friday; k <= 31; k += 7) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет.\n", k);
        }
        System.out.println("Задание 8");
        int currentYear = 2024;
        int twoHundredYearsAgo = 1824;
        int hundredYearsAhead = 2124;
        for (int j = 0; j <= hundredYearsAhead; j += 79) {
            if (j >= twoHundredYearsAgo && j <= hundredYearsAhead) {
                System.out.println(j);
            }
        }
    }
}


