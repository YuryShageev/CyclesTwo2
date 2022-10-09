public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int sum = 15000;
        int monthNum = 1;
        while (sum <= 12000000) {
            sum *= 1.07;
            System.out.printf("Месяц %d, сумма %d \n", monthNum, sum);
            monthNum++;
        }

        System.out.println("Task 3");
        int sum1 = 15000;
        for (int i = 1; i < 9 * 12; i += 6) {
            int sumBefore = sum1;
            sum1 *= 1 + 0.07 * 6;
            System.out.printf("месяц %d, сумма %d \n", i, sum1 - sumBefore);
        }

        System.out.println("Task 4");
        int firstFriday = 3;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.printf("Сегодня пятница, " + currentFriday + " число." + " Необходимо подготовить отчёт! ");
        }

    }



}
