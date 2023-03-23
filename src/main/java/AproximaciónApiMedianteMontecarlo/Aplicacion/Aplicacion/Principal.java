package AproximaciónApiMedianteMontecarlo.Aplicacion.Aplicacion;

import AproximaciónApiMedianteMontecarlo.Aplicacion.mates.Matematicas;

public class Principal {
    public static void main(String[] args){
        System.out.println("El número PI es " + Matematicas.generarNumeroPi(1000000000));
    }

}
