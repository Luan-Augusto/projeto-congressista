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

        /*
        sera criado agr uma nova instancia que efetuara uma busca nos slots
        afim de encontra-lo

        o valor devolvido tera de ser false
         */
        Congressista cong3 = new Congressista("Sicrano", 9288293);
        System.out.println(hash.containsKey(cong3)); // false

        System.out.println(hash.containsKey(cong1));
        System.out.println(hash.containsKey(cong2));

    }
}
