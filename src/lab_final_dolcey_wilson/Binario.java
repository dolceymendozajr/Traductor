package lab_final_dolcey_wilson;

public class Binario {
    public static String Convertir(String palabra) {
        String text_convertido = "";
        String temp = "";
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i); // TOMA EL CARACTER EN LA POSICIÓN i
            int ascii = (int) letra; // BUSCA EL VALOR NUMÉRICO DEL CARÁCTER(i)
            temp = "";

            for (int j = 0; j < 8; j++) {
                temp += (ascii % 2) + "";
                ascii = ascii / 2;
            }
            
            for (int j = 7; j >=0; j--)
                text_convertido += temp.substring(j, j+1);
            text_convertido += " ";
        }
        
        return text_convertido;
    }
}