package questao2;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        System.out.println(tipoDetriangulo("7 7 7"));
        System.out.println(tipoDetriangulo("7 7 8"));
        System.out.println(tipoDetriangulo("7 8 14"));
        System.out.println(tipoDetriangulo("7 8 15"));

    }

    private static String tipoDetriangulo(String valores) {

        String triangulo = "";
        String[] v = valores.split(" ");

        int ladosIguais;
        if(!v[0].equals(v[1]) && !v[0].equals(v[2]) && !v[1].equals(v[2])){
            ladosIguais = 0;
        }else if(v[0].equals(v[1]) && v[0].equals(v[2]) && v[1].equals(v[2])){
            ladosIguais = 3;
        }else{
            ladosIguais = 2;
        }

        if(ladosIguais == 3){
            triangulo = "Equilátero";
        } else if (ladosIguais == 2) {
            triangulo = "Isósceles";

        } else if (ladosIguais == 0) {
            triangulo = "Escaleno";
        }else {
            triangulo = "Não é um triangulo";
        }

        return triangulo;
    }



}
