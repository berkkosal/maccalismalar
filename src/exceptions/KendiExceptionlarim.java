package exceptions;

import java.util.Scanner;

public class KendiExceptionlarim {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int yas = tara.nextInt();

        try {
            if (yas < 0)
                throw new NegatifYasHatasi("Yaş negatif olamaz.");
        } catch (Exception e) {
            System.out.println("hata: " + e);
        }


    }
}

class NegatifYasHatasi extends Exception {
    String hataMesaji;

    public NegatifYasHatasi(String hatamesaji) {
        this.hataMesaji = hatamesaji;
    }

    @Override
    public String toString() {
        return hataMesaji;
    }
}