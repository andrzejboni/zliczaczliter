package com.company;

import java.util.Scanner;

// http://pl.spoj.com/problems/JZLICZ/

public class Main {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        int ilewierszy = Integer.parseInt(wejscie.nextLine()); // int przyjmuje info z klawy ile wierszy jest do przemielenia

        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int[] licznik = new int[alfabet.length]; // sluzy do zliczania wystąpień liter

        for (int s = 0; s < ilewierszy ; s++ ) {  //uruchamia procedurę zależnie od wprowadzonej informacji ile wierszy


            String tekst = wejscie.nextLine();
            String tekst1 = tekst;
            char przemielony = tekst1.charAt(0);  // returns 'l'
            char[] wtablicy = tekst1.toCharArray();


            for (int u = 0; u < alfabet.length; u++) {

                for (int j = 0; j < wtablicy.length; j++) {

                    if (alfabet[u] == wtablicy[j]) { // sprawdza czy alfabet[0] -> litera a jest taka sama jak wablicy[0] czyli jakis wprowadzony tekst. Jestli tak dodaje 1
                        licznik[u]++;
                    }
                }


            }

        }
            for (int h = 0; h < alfabet.length; h++)
            {
                if (licznik[h] != 0) {
                    System.out.println(alfabet[h] + " " + licznik[h]);
                }
            }

    }
}

