package lab_final_dolcey_wilson;

import java.util.Scanner;

public class MetodoEncript {

    static char dicc[] = new char[32];
    static int num[] = new int[32];
    static char abc[] = {'n', 'H', 'D', 'a', 'e',
        'Q', 'F', 'b', 'w', 's',
        'v', 'O', 'y', 'R', 'S',
        'r', 'u', 'Z', 'o', 'ñ',
        'x', 'N', 'h', 'U', 'J',
        'W', 'i', 'p', 'I', 'c',
        'B', 'f'};
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    }

    // FUNCIÓN PARA ENCRIPTRAR
    public static String encrip(String frase) {
        GenerarVect();
        int a = 0;
        String cod = "";

        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < dicc.length; j++) {
                if (dicc[j] == frase.charAt(i)) {
                    a = num[j];
                }
            }
            cod = cod + (char) a;
        }
        
        return cod;
    }
    
    // FUNCIÓN PARA DESENCRIPTAR
    
    public static String desencrip(String encriptada) {
        GenerarVect();
        String desen = "";
        int ch = 0;
        
        for (int i = 0; i < encriptada.length(); i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[j] == encriptada.charAt(i)) {
                    ch = dicc[j];
                }
            }
            desen += (char) ch;
        }
        
        return desen;
    }

    static void GenerarVect() {
        // BLOQUE 1: GENERAR EL ALFABETO ESPAÑOL :)
        int letra = (int) 'a';
        for (int i = 0; i < 27; i++) {
            if (i < 14) {
                dicc[i] = (char) (letra);
            } else if (i == 14) {
                dicc[i] = 'ñ';
            } else if (i > 14) {
                dicc[i] = (char) (letra - 1);
            }
            letra++;
        }

        // AGREGAR LAS VOCALES CON TILDE :)
        dicc[27] = 'á';
        dicc[28] = 'é';
        dicc[29] = 'í';
        dicc[30] = 'ó';
        dicc[31] = 'ú';

        // BLOQUE 2 - GENERAR VECTOR DE NUMEROS
        for (int i = 0; i < num.length; i++)
            num[i] = (int) abc[i];
    }

}
