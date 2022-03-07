package com.paweldubel.functions;

public class Arrays {


    static int zero = 0;
    int one = 1;

    static int[] testNumbers = new int[3];
    static int[] numbers ={ 0,63,63,7};
    public static void CheckArrayNumbers(){

        String[] names =  {"jeden", "dwa"};
        String[] stringBuffer = new String[999];

        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println("size of the array is : " + numbers.length);
        System.out.println(names.length);
        zero++;
        zero--;
        zero+=65;
        System.out.println(zero);

        for (int i = 0; i < numbers.length; i++) {
            
        }

        for (int i = 0; i < names.length; i++) {

        }


        System.out.println("Rozmiar tablicy przed zwiekszeniem :" + names.length);
        System.out.println("Sklad tablicy przed zwiekszeniem :" + java.util.Arrays.toString(names));
        //stringBuffer = names;
        stringBuffer = names.clone();
        names = new String[names.length+1];
        for (int i = 0; i < names.length-1; i++) {
            names[i] = stringBuffer[i];

        }
        names[names.length-1]= "Nowa linijka";
        System.out.println("Rozmiar tablicy po zwiekszeniu :" + names.length);
        System.out.println("Sklad tablicy po zwiekszeniu :" + java.util.Arrays.toString(names));


        java.util.Arrays.stream(numbers).forEach(System.out::println);
        java.util.Arrays.stream(names).forEach(System.out::println);
    }





}
