package com.paweldubel.javastart;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Pracownik implements Czlowiek {

    @Override
    public void ArmSystem(int code) {
        if (code == 2402)
    {
            System.out.println("system armed");
        }
    }

    @Override
    public void OpenDoor() {
        System.out.println("otwiera drzwi");
    }
    @Override
    public void Log(String text)  {

        try {
            File file = new File("logs.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(text+"\n");
            writer.close();
        } catch (IOException e) {
            // ignore e.printStackTrace();
        }

    }
    int wyplata;
    String imie;
    String nazwisko;

    Pracownik(){

    }
    Pracownik(int wyplata, String imie, String nazwisko){

        this.wyplata =wyplata;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

}


class Szef extends Pracownik{
    int premia;
}



