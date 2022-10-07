public class Main {
    public static void main(String[] args) {
        //пример
        //System.out.println("Example");
        //int salary = 65535;
        //int total = 0;
        //int rate = 12;
        //int month = 1;
        //int i = 0;
       // for (;total < 1_000_000; i++) {
        //    total = total + (total/100 * rate/12);
         //   total = total + salary;
        //    month = month + 1;
        //    if (i % 5 == 0) {
        //        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        //    }
        //}

        //Задача 1
        System.out.println("Task 1");
        int moneyPerMonth = 15000;
        int total = 0;
        int rate = 7;
        int month = 1;
        int i = 0;
        for (; total <= 12_000_000; i ++) {
            total = total + (total/100 * rate/12);
            total = total + moneyPerMonth;
            month = month + 1;
            System.out.println(month + " месяцев требуется, чтобы накопить " + total + " рублей");
        }


    }
}