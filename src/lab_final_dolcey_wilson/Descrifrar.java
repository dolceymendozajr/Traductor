package lab_final_dolcey_wilson;

public class Descrifrar {
    public static String Descifrar(String binario, String clave) {
        String texto = "";
        String[] pal_binarias = binario.split(" ");

        int verificar = 0;
        
        for (String pal_binaria : pal_binarias) {
            if (pal_binaria.length() == 8)
                verificar++;
        }
        
        if (verificar < pal_binarias.length)
            texto = "BINARIO NO VÁLIDO :(";
        else {
            String temp_binario = Binario.Descifrar(binario);
            String temp_vige = EncriptarVigenere.Desencript(temp_binario, clave);
            String propio = MetodoEncript.desencrip(temp_vige);
            texto = propio;
        }

        return texto;
    }
}
