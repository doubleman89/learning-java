package com.paweldubel.amigoscode.functions;
class PunktX{
    int x;
    int y ;
    String name;



    public PunktX(){

    }

    public PunktX(int a, int b){

        x = a;
        y = b;

    }

    public PunktX(PunktX pkt){
        x=pkt.x;
        y= pkt.y;

    }





}
public class Punkt {


    public static void main(String[] args){

        PunktX punktX = new PunktX();

        PunktX punktX3 = new PunktX(1,2);
        PunktX punktX2 = new PunktX(punktX3);

        System.out.println("Wspolrzedne punktu x " + punktX.x + " , " + punktX.y );
        System.out.println("Wspolrzedne punktu x2 " + punktX2.x + " , " + punktX2.y );
        System.out.println("Wspolrzedne punktu x3 " + punktX3.x + " , " + punktX3.y );


    }
}
