package com.paweldubel.amigoscode.functions;

import java.util.Scanner;

public class GenderCheck {
public static void GenderCheck() {
    boolean genderDetected;
    genderDetected = false;

    while (genderDetected != true) {
        Scanner scanner = new Scanner(System.in);
        String gender;

        System.out.println("Please fill the gender");
        gender = scanner.nextLine();
        gender = gender.toUpperCase();

        switch (gender) {
            case "FEMALE":

                System.out.println("You are a female");

                genderDetected = true;
                break;

            case "MALE":

                System.out.println("You are a male");

                genderDetected = true;
                break;

            default:

                System.out.println("gender unknown, please fill in again  ");


        }

    }
}}
