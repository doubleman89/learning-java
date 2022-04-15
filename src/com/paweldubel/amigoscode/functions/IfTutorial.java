package com.paweldubel.amigoscode.functions;

public class IfTutorial {



    public void whileLoopTest(int lowRange, int highRange) {
        int number = lowRange;

        while (number <= highRange) {
            System.out.println(number);
            number++;


        }
        number = lowRange;

        while (number <= highRange) {

            if (number % 2 == 0) {
                System.out.println(number);

            }
            number++;
        }
    }

    public static void forLoopTest(int lowRange, int highRange)
    {

        for (int i = lowRange; i <= highRange; i++) {

            if (i%2 == 0 )
            {
                System.out.println(i);
            }

        }


    }

public static int returnTotal (int[][] intArray)
{
int total = 0;
    for (int[] i:intArray
         ) {
        for (int j:i
             ) {
            total = total + j;
        }

    }
    System.out.println(total);

total = 0;

    for (int i = 0; i < intArray.length ; i++) {


        for (int j = 0; j < intArray[i].length ; j++) {
          total = total + intArray[i][j];


        }


    }

    System.out.println(total);

    return total;
    }





}
