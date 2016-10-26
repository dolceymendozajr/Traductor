package lab_final_dolcey_wilson;

import java.util.Scanner;

public class MetodoEncript {

    static char dicc[] = new char[32];
//    65 - 90 (A)
//    97 - 122 (a)
//    160 - 163 (á)
//    65 67 68 69 70 71 72 73 74 75 76 78 80 83 84 86 93 95 98 99 100 102 105 107 110 114 120 121 122 152 153 161 163 
    static int num[] = new int[32];
    static char abc[] = {'n', 'H', 'a', 'e', 'Q', 'O','R', 'r', 'u', 'Z', 'o','ñ', 'N', 'h', 'J', 'i','p', 'I'};
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    }

    static void GenerarVect() {
        // BLOQUE 1: GENERAR EL ALFABETO ESPAÑOL :)
        int letra = (int) 'a';
        for (int i = 0; i < 27; i++) {
            if (i < 14)
                dicc[i] = (char) (letra);
            else if (i == 14)
                dicc[i] = 'ñ';
            else if (i > 14)
                dicc[i] = (char) (letra - 1);
            letra++;
        }

        // AGREGAR LAS VOCALES CON TILDE :)
        dicc[27] = 'á';
        dicc[28] = 'é';
        dicc[29] = 'í';
        dicc[30] = 'ó';
        dicc[31] = 'ú';
        
        System.out.println("TAM: " + abc.length);
        // BLOQUE 2 - GENERAR VECTOR DE NUMEROS
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) abc[i];
            System.out.println(num[i]);
        }
    }

    // FUNCIÓN PARA ENCRIPTRAR
    public static String encrip(String frase) {
        GenerarVect();
        int a = 0;
        String cod = "";

        for (int i = 0; i < frase.length(); i++) {
            for (int j= 0; j < dicc.length; j++) {
                if (dicc[j] == frase.charAt(i))
                    a = num[j];
            }
            cod = cod + (char) a;
        }

        System.out.println(frase + " / " + cod);
        System.out.println((char) a);
        return cod;
    }
}
