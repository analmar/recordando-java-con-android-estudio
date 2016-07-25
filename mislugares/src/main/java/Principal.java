//import com.example.mislugares.Lugar;
import com.example.mislugares.*;

/**
 * Created by toni on 25/07/16.
 */
class Principal {
    public static void main(String[] main) {
        Complejo z, w;
        z = new Complejo(-1.5, 3.0);
        w = new Complejo(-1.2, 2.4);
        z.suma(w);
        System.out.println("Complejo: " + z.toString());
        System.out.println("-------------");

        Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,
                TipoLugar.EDUCACION,962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);
        System.out.println("Lugar " + lugar.toString());

        System.out.println("-------------");

        GeoPuntoAlt g1= new GeoPuntoAlt(-0.166093, 38.995656,10);
        GeoPuntoAlt g2= new GeoPuntoAlt(-0.166093, 37.995656,220);

        System.out.println("distancia="+g2.distancia(g1));
        System.out.println(" ");

        GeoPunto lGeo[] = new GeoPunto[3];
        lGeo[0]= new GeoPuntoAlt(-0.166093, 38.995656,10);
        lGeo[1]= new GeoPunto(-0.166093, 38.995656);
        lGeo[2]= new GeoPuntoAlt(-0.166093, 38.995656,210);

        for (int i=0;i<lGeo.length;i++){
            System.out.println(" Punto : "+lGeo[i]);
            if (lGeo[i] instanceof GeoPuntoAlt){
                if ( ( (GeoPuntoAlt) lGeo[i] ).getAltura()>100){
                    System.out.println("     punto Elevado " );
                }


            }
        }

        for (GeoPunto aLGeo : lGeo) {
            System.out.println(" Punto : " + aLGeo);
            if (aLGeo instanceof GeoPuntoAlt) {
                if (((GeoPuntoAlt) aLGeo).getAltura() > 100) {
                    System.out.println("     punto Elevado ");
                }


            }
        }

        System.out.println("-------------");

        Complejo lista[] = new Complejo[4];
        lista[0] = new Complejo(-1.5, 3.0);
        lista[1] = new Complejo(-1.2, -3.0);
        lista[2] = new ComplejoAmpliado(-1.5, 3.0);
        lista[3] = new ComplejoAmpliado(-1.2, 0);
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Complejo: " + lista[i]);
        }

        System.out.println("-- -- -- --");

        for(int i = 0; i < lista.length; i++) {
            System.out.println("Complejo: " + lista[i]);
            if(lista[i] instanceof ComplejoAmpliado){
                System.out.println("  esReal=" + ((ComplejoAmpliado) lista[i]).esReal());
            }
        }
        System.out.println("-------------");

    }
}