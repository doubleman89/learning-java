package com.paweldubel.samouczekprogramisty.basics;

public class Garnek {
    int srednica;
    int wysokosc;
    String kolor;

    public Garnek(){
    }

    public Garnek(int srednica, int wysokosc, String kolor){
        this.srednica = srednica;
        this.wysokosc =wysokosc;
        this.kolor = kolor;




    }

    public Garnek(int srednica, int wysokosc){
        this.srednica=srednica;
        this.wysokosc=wysokosc;
    }


    public String gotuj() {


        return "gotowanie w trakcie";

    }
    public String gotuj(boolean czyDodalismysol){

        if(czyDodalismysol) {
            return "gotowanie z sola";

        }else {
            return "gotowanie bez soli";
        }


    }

    public int zwrocTemperatureWrzeniaWody(){
        return 100;
    }

    public void wlaczGarnek(){
        System.out.println("właczanie garnka");
        gotujPrzezPolGodziny();
    }

    private void gotujPrzezPolGodziny(){
        System.out.println("gotowanie prze 30 minut");
    }

}
