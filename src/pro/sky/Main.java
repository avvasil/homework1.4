package pro.sky;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // task1

         System.out.println();
         System.out.println("Задача 1");

         int i = 1;

          while (i <= 10) {
              System.out.print(i + " ");
              i++;
          }

          System.out.println();

          for (i = 10; i > 0; i--) {
             System.out.print(i + " ");
          }

        System.out.println();

        // task2
        System.out.println();
        System.out.println("Задача 2");

        int firstFridayOfTheMonth = 4;

        if (0 < firstFridayOfTheMonth && firstFridayOfTheMonth < 8) {

            while (firstFridayOfTheMonth <= 31) {
                System.out.println("Сегодня пятница, " + firstFridayOfTheMonth + "-е число. Необходимо подготовить отчет.");
                firstFridayOfTheMonth += 7;
            }
        } else
            System.out.println("Введите номер дня недели от 1 до 7.");


        // task3
        System.out.println();
        System.out.println("Задача 3");


        int currentYear = 2021;
        int yearsInThePast = 200;
        int yearsInTheFuture = 100;
        int startYear = currentYear - yearsInThePast;
        int endYear = currentYear + yearsInTheFuture;
        int appearancePeriod = 79;


        for (int k = startYear; k <= endYear; k++) {
            if (k % appearancePeriod == 0) {
                System.out.println(k);
            }
        }
    }
}
