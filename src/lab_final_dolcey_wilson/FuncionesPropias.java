package lab_final_dolcey_wilson;

public class FuncionesPropias {
    
    public static char CharAtt(String word, int i) {
        if (i > -1 && i <= word.length() - 1) {
            char[] chara = word.toCharArray();
            return chara[i];
        } else
            return '?';
    }
    
    public static int ContarElemEpeci(String word, String elem) {
        int ve = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i +1).equals(elem)) {
                ve++;
            }
        }
        return ve;
    }
}
