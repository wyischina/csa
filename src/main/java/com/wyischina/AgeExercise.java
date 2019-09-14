package com.wyischina;

import java.util.Calendar;
import java.util.Scanner;

public class AgeExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which year were you borned?");
        int year = scanner.nextInt();
        System.out.println("Which month is your birthday? (1 = Jan, 2 = Feb...)");
        int month = scanner.nextInt();
        System.out.println("Which day is your birthday?");
        int day = scanner.nextInt();

        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month - 1, day);
        long birthdayTimeSinceEpoch = birthday.getTimeInMillis();

        Calendar now = Calendar.getInstance();
        long currentTimeSinceEpoch = now.getTimeInMillis();

        long ageInMilliseconds = currentTimeSinceEpoch - birthdayTimeSinceEpoch;
        float ageInYears = ageInMilliseconds / (365 * 24 * 60 * 60 * 1000f);
        System.out.println("your age is " + Math.round(Math.floor(ageInYears)) + " years old");
    }
}
