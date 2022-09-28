package edemirog_1;

public class SayiBulma {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == 9) {
                System.out.println("Aradığınız sayı dizinin " + (i +1) +"'nci" + " elemanında mevcut");
                return;
            }
        }
        System.out.println("Aradığınız sayı dizide mevcut değil.");

    }
}
