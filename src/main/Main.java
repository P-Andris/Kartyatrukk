package main;

import java.util.Scanner;

public class Main {
    public static String[] pakli = new String[21];
    public static int tippelesekSzama = 0;
    
    public static void alaphelyzet() {
        String[] szinek = {"Piros", "Zöld", "Tök"};
        String[] szamok = {"7", "8", "9", "10", "Alsó", "Felső", "Király"};
        
        for(int i = 0; i < pakli.length; i++) {
            for(int j = 0; j < szamok.length; j++) {
                for(int k = 0; k < szinek.length; k++) {
                    pakli[i] = szinek[k] + szamok[j];
                }
            }
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
