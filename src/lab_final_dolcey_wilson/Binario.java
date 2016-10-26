package lab_final_dolcey_wilson;

public class Binario {
    public static String Convertir(String palabra) {
        String text_convertido = "";
        int temp_bin[] = new int[100];
        int j = 0;
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i); // TOMA EL CARACTER EN LA POSICIÓN i
            int ascii = (int) letra; // BUSCA EL VALOR NUMÉRICO DEL CARÁCTER(i)
//            System.out.println(ascii);
        }
        
        System.out.println(text_convertido);
        
        return text_convertido;
    }
}
