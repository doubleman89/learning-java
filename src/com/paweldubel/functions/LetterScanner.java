package com.paweldubel.functions;

import java.util.Scanner;

public class LetterScanner {



    public static void main(char letter, char [] lettersArray) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("");
        char[] letters = {'a', 'a', 'b', 'c', 'd', 'd', 'd'};
        char checkedLetter = '\0';

        System.out.println("Please fill the letter You want to check the count");
        do  {
            checkedLetter = scanner.next("[A-Za-z]+").charAt(0);

        }while (scanner.hasNext("[A-Za-z]+"));
        scanner.close();

        int count = countSpecificLetter(checkedLetter, letters);

        System.out.println("there are " + count + " " + "\"" + checkedLetter + "\" in the array");

    }


public static void CreateArray()
{
    System.out.println("Please fill the letters for an array ");


}


    public static int countSpecificLetter ( char letter, char [] lettersArray)
    {
        int count = 0;

        for (int i = 0; i < lettersArray.length; i++) {

            if (lettersArray[i] == letter )
            {
                count++;
            }


        }

        return count;


    }
}
