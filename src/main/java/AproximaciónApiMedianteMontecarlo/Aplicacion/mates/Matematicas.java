package AproximaciónApiMedianteMontecarlo.Aplicacion.mates;

public class Matematicas {

    public static double generarNumeroPi(long puntosT){

        double aciertos = 0;
        double areaCuadrado = 0;

        for (int i = 0; i < puntosT; i++){
            double x = Math.random();
            double y = Math.random();
            double cuadrado = x*x + y*y;
            if (cuadrado <= 1){
                aciertos++;
            }
        }
        areaCuadrado = 4 * (aciertos/puntosT);
        return areaCuadrado;
    }

}

