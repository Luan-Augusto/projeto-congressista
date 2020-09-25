package in.augustluan.entidades;

import java.util.HashMap;

public abstract class Teste {

    public static void main(String args[]) {

        Congressista cong1 = new Congressista("Luan", 12345);
        Congressista cong2 = new Congressista("Fulan", 54321);

        HashMap<Congressista, String> hash = new HashMap<Congressista, String>();

        // adicionando no hash
        hash.put(cong1, "Informacao importante sobre " + cong1);
        hash.put(cong2, "Informacao importante sobre " + cong2);

        
    }
}
