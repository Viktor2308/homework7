package com.skypro.homework7;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Task 1");
        int moneyMonth = 15000;
        int needMoney = 2_459_000;
        int saveMoneyInBank = 0;
        int totalMonth = 0;
        while (saveMoneyInBank<needMoney){
            saveMoneyInBank += saveMoneyInBank/100;
            saveMoneyInBank += moneyMonth;
            totalMonth++;
            System.out.println("In " + totalMonth + " month, money in bank " + saveMoneyInBank + " rub.");
        }
        System.out.println("Total month " + totalMonth + ", money saving " + saveMoneyInBank + " rub.");
    }
    public static void task2(){
        System.out.println("\nTask 2");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (;num >0; num--){
            System.out.print(num + " ");
        }
    }
    public static void task3(){
        System.out.println("\n\nTask 3");
        int countryPopulation = 12_000_000;
        int birthRate = 17; //17 people per 1000
        int deathRate = 8; // 8 people per 1000
        int year = 0;
        while (year<10){
            countryPopulation = countryPopulation + (countryPopulation/1000)*birthRate - (countryPopulation/1000)*deathRate;
            year++;
            System.out.println("Year " + year + ", country population is " + countryPopulation + " people.");
        }
    }
    public static void task4(){
        System.out.println("\nTask 4");
        int percentDeposit = 7;
        int totalMoney = 12_000_000;
        int saveMoney = 15000; // initial deposit
        int totalMonth = 0;
        while (saveMoney<totalMoney){
            saveMoney += (saveMoney/100)*percentDeposit;
            totalMonth++;
            System.out.println("In "+ totalMonth + " month save money " + saveMoney + " rub.");
        }
    }
    public static void task5(){
        System.out.println("\nTask 5");
        int percentDeposit = 7;
        int totalMoney = 12_000_000;
        int saveMoney = 15000; // initial deposit
        int totalMonth = 0;
        while (saveMoney<totalMoney) {
            saveMoney += (saveMoney / 100) * percentDeposit;
            totalMonth++;
            if (totalMonth % 6 == 0){
                System.out.println("In " + totalMonth + " month save money " + saveMoney + " rub.");
            }
        }
        System.out.println("Vasily collect money on " + totalMonth + " month.");
    }
    public static void task6(){
        System.out.println("\nTask 5");
        int percentDeposit = 7;
 //       int totalMoney = 12_000_000;
        int saveMoney = 15000; // initial deposit
        int totalMonth = 9*12;
        int month = 0;
        while (month<totalMonth) {
            saveMoney += (saveMoney / 100) * percentDeposit;
            month++;
            if (month % 6 == 0){
                System.out.println("In " + month + " month save money " + saveMoney + " rub.");
            }
        }
        System.out.println("Vasily collect " + saveMoney + " rub. on " + totalMonth + " month.");
    }
    public static void task7(){
        System.out.println("\nTask 7");
        int month = 31;
        int firstFriday = 3;
        int dayOfMonth = 1;
        while (dayOfMonth<=month) {
            if(dayOfMonth == firstFriday || (dayOfMonth-firstFriday)%7 == 0){
                System.out.println("Today is friday the " + dayOfMonth + "th. Need to prepare a report.");
            }
            dayOfMonth++;
        }
    }
    public static void task8(){
        System.out.println("\nTask 8");
        int year = 2023;
        int startSetPeriod = year - 200;
        int finishSetPeriod = year + 100;
        for (int i = 0; i<finishSetPeriod; i+=79){
            if (i>startSetPeriod){
                System.out.println(i);
            }
        }
    }

}
