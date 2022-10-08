package exceptions;

import kotlin.time.DurationJvmKt;

public class ExceptionKavrami {
    public static void main(String[] args) {

        try {
            Integer sayi = new Integer("fırteag");
            System.out.println(sayi);
        } catch (Exception e) {
            System.out.println("Hata çıktı." + e);
        }

        try {
            int sonuc = 5 / 0;
        } catch (Exception e) {
            System.out.println("Hataaaa" + e);
        }

        try {
            int[] sayilar = {1, 2, 3};
            System.out.println(" " + sayilar[4]);
        } catch (Exception e) {
            System.out.println("hata: " + e);
        }


        try {
            Object a = new Object();
            String b = (String) a;

        } catch (Exception e) {
            System.out.println("Hataa: " + e);

        } finally {
            System.out.println("Program buradan devam etmeli.");
            System.out.println("Finally çalıştırıldı.");

        }


    }
}
