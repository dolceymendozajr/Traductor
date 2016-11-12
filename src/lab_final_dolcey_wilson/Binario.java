package lab_final_dolcey_wilson;

public class Binario {
    static int[] n_extendidas = {
        11100001, 11101001, 11101101,
        11110011, 11111010, 11000001,
        11001001, 11001101, 11010011,
        11011010, 11110001, 11010001};
    static char[] extendidas = {
        'á', 'é', 'í',
        'ó', 'ú', 'Á',
        'É', 'Í', 'Ó',
        'Ú', 'ñ', 'Ñ'};

    public static String Convertir(String palabra) {
        String text_convertido = "";
        String temp = "";
        boolean sw = true;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i); // TOMA EL CARACTER EN LA POSICIÓN i
            temp = "";
            sw = true;
            int n = 0;
            while (sw && n < extendidas.length) {
               if (extendidas[n] == letra) {
                    temp = n_extendidas[n] + "";
                    sw = false;
                } 
               n++;
            }

            if (sw) {
                int ascii = (int) letra; // BUSCA EL VALOR NUMÉRICO DEL CARÁCTER(i)
                temp = "";

                for (int j = 0; j < 8; j++) {
                    temp += (ascii % 2) + "";
                    ascii = ascii / 2;
                }

                for (int j = 7; j >= 0; j--)
                    text_convertido += temp.substring(j, j + 1);
                
                text_convertido += " ";
            } else
                text_convertido += temp + " ";
        }

        return text_convertido;
    }

    public static String Descifrar(String palabra) {
        String[] frase = palabra.split(" ");
        String pal_final = "";
        boolean sw;
        String temp = "";
        
        for (int i = 0; i < frase.length; i++) {
            sw = true;
            int j = 0;
            while (sw && j < extendidas.length) {
                if (Integer.parseInt(frase[i]) == n_extendidas[j]) {
                    sw = false;
                    temp = extendidas[j] + "";
                } j++;
            }
            
            if (sw) {
                int sum = 0;
                int n = 7;
                for (int k = 0; k < frase[i].length(); k++) {
                   sum += (Integer.parseInt(frase[i].substring(k, k + 1)) * (Math.pow(2, n)));
                   n--;
                }
                pal_final += (char) sum;
            } else
                pal_final += temp;
        }
        
        return pal_final;
    }
}