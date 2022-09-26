package tum_edemirog;

import java.util.Scanner;

public class EnBuyukSayi {

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        int sayi1 = tara.nextInt();
        int sayi2 = tara.nextInt();
        int sayi3 = tara.nextInt();
        int enBuyukSayi = sayi1;

        if (enBuyukSayi < sayi2){
            enBuyukSayi = sayi2;
        }

        if (enBuyukSayi < sayi3){
            enBuyukSayi = sayi3;
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);





    }

}
