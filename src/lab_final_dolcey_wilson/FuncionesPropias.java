package lab_final_dolcey_wilson;

public class FuncionesPropias {
    
    public static char CharAtt(String word, int i) {
        if (i > -1 && i <= word.length() - 1) {
            char[] chara = word.toCharArray();
            return chara[i];
        } else
            return '?';
    }
    
    public static void Splittt(String[] palabras, String palabra, String elem) { // FUNCION DE SPLIT
        int a = 0, j = 0;
        for (int i = 0; i < palabra.length(); i++) { // RECORRE TODA LA PALABRA
            if (palabra.substring(i, i + 1).equals(elem)) { // SI EL CARÁCTER DE LA POSICIÓN ACTUAL i ES IGUAL AL ELEMENTO BUSCADO (elem)
                palabras[j] = palabra.substring( a, i); // INVOCA AL SUBSTRING PARA TOMAR CADA CARÁCTER INDIVIDUALMENTE
                a = i + 1; // TOMA LA POSICIÓN DEL CARÁCTER NUEVO ENCONTRADO
                j++;
            } else if (i == palabra.length() - 1) // SI LLEGÓ AL ÚLTIMO CARÁCTER, TOMA LA POSICIÓN DE LA ÚLTIMA COINCIDENCIA Y CREA UN SUBSTRING 
                palabras[j] = palabra.substring(a, palabra.length());
        }
    }
}
