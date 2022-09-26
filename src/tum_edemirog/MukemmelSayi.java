package tum_edemirog;

public class MukemmelSayi {


    public static void main(String[] args) {

        int sayi1 = 4;
        int toplam = 0;


        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam = i + toplam;
            }
        }
        if (toplam == sayi1) {
            System.out.println("Mükemmel sayı.");

        } else System.out.println("Mükemmel sayı değil.");


    }
}
