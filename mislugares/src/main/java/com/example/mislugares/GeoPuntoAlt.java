package com.example.mislugares;

/**
 * Created by toni on 25/07/16.
 */
public class GeoPuntoAlt extends GeoPunto {

    private double altura;

    public GeoPuntoAlt(double longitud, double latitud, double altura) {
        super(longitud, latitud);
        this.altura=altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double distancia(GeoPuntoAlt punto) {
        double d=super.distancia(punto);

        System.out.println("-- - - --");
        System.out.println(" distancia de Geopunto = " + d);
        System.out.println("-- - - --");
        double a=punto.getAltura()-altura;
        return Math.sqrt( (d*d) + (a*a) );
    }
}
