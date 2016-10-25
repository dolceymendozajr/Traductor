package lab_final_dolcey_wilson;

import java.util.Scanner;

public class MetodoEncript {
    static Scanner sc = new Scanner(System.in);
    static String letras[][] = {{"0", "A", "B", "C", "D"},
                                {"1", "A", "B", "C", "D"},
                                {"2", "E", "F", "G", "H"},
                                {"3", "I", "J", "K", "L"},
                                {"4", "M", "N", "Ñ", "O"},
                                {"5", "P", "Q", "R", "S"},
                                {"6", "T", "U", "V", "W"},
                                {"7", "X", "Y", "Z", " "}
        }; // DICCIONARIO DE CONVERSIÓN
    
    public static void main(String[] args) {
        //clave -> clave para encriptar
//        System.out.print("ESCRIBA PALABRA: "); String frase = sc.nextLine();
//        System.out.print("CLAVE: "); int clave = sc.nextInt();
//
//        while ((clave <= 99) || (clave > 900)) { System.out.println("CLAVE DEBE TENER 3 DÍGITOS Y DEBE SER MENOR QUE 900: "); clave = sc.nextInt(); }
//        
//        System.out.println(""); System.out.println("..."); System.out.println("");
//        System.out.println("CODIGO GENERADO: " + encrip(frase, clave));
    }
    
    // FUNCIÓN PARA ENCRIPTRAR
    public static String encrip(String frase, int clave) {
        String str_clave =  clave + "", cod = "";
        int prt1 = Integer.parseInt(str_clave.substring(0, 2));
        int prt2 = Integer.parseInt(str_clave.substring(2, 3));
        
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 1; j <= 7; j++) {
                for (int k = 1; k <= 4; k++) {
                    // CONVIERTE CADA LETRA (Y ESPACIOS) EN SU CÓDIGO CORRESPONDIENTE :)
                    if (frase.substring(i, i + 1).equalsIgnoreCase(letras[j][k])) {
                        if (clave % 2 != 0) {
                            cod = cod + (j + prt2) + prt1 + letras[0][k]; cod = cod + "//";
                        } else
                            cod = cod + (j + prt1) + prt2 + letras[0][k]; cod = cod + "\\";
                    }
                }
            }
        }
        
        return cod;
    }
}
