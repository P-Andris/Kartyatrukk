package main;

import java.util.Scanner;

public class Main {
    public static String[] pakli = new String[21];
    public static String[] szinek = {"Piros", "Zöld", "Makk", "Tök"};
    public static String[] szamok = {"7", "8", "9", "10", "Alsó", "Felső"};;
    public static int tippelesekSzama = 0;
    
    public static void alaphelyzet() {
        int i = 0, j = 0, k = 0;
        while(i < pakli.length) {
            pakli[i] = szinek[j] + szamok[k];
            k++;
            if(k == szamok.length) {
                k = 0;
                j++;
            }
            // System.out.println(pakli[i]);
            i++;
        }
    }
    
    public static void mutat() {
        String egeszPakli = "";
        for(int i = 0; i < pakli.length; i++) {
            egeszPakli += pakli[i];
        }
        System.out.println(egeszPakli);
    }
    
    public static int beker() {
        Scanner sc = new Scanner(System.in);
        int tipp = 0;
        
        if(tippelesekSzama != 3) {
            while(!(tipp >= 1 && tipp <= 3)) {
                System.out.print("Melyikben van a kártya? ");
                tipp = sc.nextInt();
            }
            tipp--;
            tippelesekSzama++;
        }
        return tipp;
    }
    
    public static void kever() {
    
    }
    
    // MAIN:
    public static void main(String[] args) {
        alaphelyzet();
        while(tippelesekSzama != 3) {
            mutat();
            beker();
            kever();
        }
    }
    
}
