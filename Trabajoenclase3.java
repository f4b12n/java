package co.com.ps.b3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trabajoenclase3 {

    public static void main(String[] args) {

        List<String> lista= new ArrayList<>();
        Scanner reader = new Scanner(System.in);


        System.out.println("Ingrese 5 palabras");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite la palabra " + (i + 1));
            lista.add(reader.next());

        }
        System.out.println("\nEsta es tu lista");

        for ( int i = 0; i < 5; i++) {

            System.out.println(lista.get(i));
        }

        int cont = 0;
        for (String palabra : lista) {
            if (palabra.length() > 4) {
                cont++;
            }

        }

        System.out.println("\nEn esta lista hay " + cont + " palabras con mas de 4 letras");

    }

}
