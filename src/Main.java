public class Main {
    public static void main(String[] args) {
       //Задача 1
        int total = 2459000;
        int solary = 15000;
        int totalMoney = 0;
        int month = 0;
        while (totalMoney <= total) {
            totalMoney += totalMoney * 0.12;
            totalMoney += solary;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + totalMoney + " рублей");
        }
        // Задача 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        {
            System.out.println();
        }
        // Задача 3
        int totalPeople = 12000000;
        int mortality = 8;
        int natality = 17;
        for (int j = 1; j <= 10; j++) {
            totalPeople += totalPeople / 1000 * (natality - mortality);
            System.out.println("Год, " + j + " численность населения составляет " + totalPeople);
        }
        // Задача 4
        int allMoney = 12000000;
        int deposit = 15000;
        int totalDeposit = 0;
        int months = 0;
        while (totalDeposit <= allMoney) {
            totalDeposit += totalDeposit * 7 / 100;
            totalDeposit += deposit;
            months++;
            System.out.println("Месяц " + months + " сумма накоплений равна " + totalDeposit + " рублей");
        }
        // Задача 5
        int allMoneys = 12000000;
        int deposits = 15000;
        int totalDeposits = 0;
        int monthss = 0;
        while (totalDeposits <= allMoneys) {
            totalDeposits += totalDeposits * 7 / 100;
            totalDeposits += deposits;
            monthss++;
            if (monthss % 6 == 0) {
                System.out.println("Месяц " + monthss + " сумма накоплений равна " + totalDeposits + " рублей");
            }
        }
        // Задача 6
        int depositMoney = 15000;
        int allDeposit = 0;
        for (int k = 0; k <= 12 * 9; k++) {
            allDeposit += allDeposit * 7 / 100;
            allDeposit += depositMoney;
            if (k % 6 ==0) {
                System.out.println("Месяц " + k + " сумма накоплений равна " + allDeposit + " рублей");
            }
        }
        int firstFriday = 3;
      while (firstFriday <= 31){
            System.out.println("сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
        firstFriday = firstFriday + 7;
        }
      int report = 2024;
      int startReport = report - 200;
      int finishReport = report + 100;
      for (int t = startReport; t <= finishReport; t++) {
          if (t % 79 ==0)
          System.out.println(t);
      }
    }
    }
