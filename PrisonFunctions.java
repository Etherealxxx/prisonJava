package org.example;
import java.util.Scanner;

public class PrisonFunctions {
    public static void lockdown() {
        System.out.println("Тюрьма находится в режиме полной изоляции.");
    }

    public static void visitationHours() {
        System.out.println("Часы посещений для заключенных: с 10:00 до 12:00.");
    }

    public static void countPrisoners() {
        int totalPrisoners = 30;
        System.out.println("Общее количество заключенных в тюрьме: " + totalPrisoners);
    }

    public void exerciseYard() {
        System.out.println("Время для прогулки.");
    }

    public void mailCall() {
        System.out.println("Проверка почты для заключенных.");
    }

    public void paroleHearing() {
        System.out.println("Заседание по делу удо.");
    }

    public void visitorRegistration() {
        visitationHours();
        System.out.println("Процедура регистрации посетителей.");
    }

    public void contrabandCheck() {
        System.out.println("Проверка на контрабанду.");
    }

    public void solitaryConfinement() {
        lockdown();
        System.out.println("Заключение в одиночную камеру.");
    }

    public static void main(String[] args) {
        countPrisoners();
        lockdown();

        PrisonFunctions prison = new PrisonFunctions();
        prison.exerciseYard();
        prison.mailCall();
        prison.paroleHearing();
        prison.visitorRegistration();
        prison.contrabandCheck();
        prison.solitaryConfinement();
        
    }
//СЭР ДА СЭР 
}
