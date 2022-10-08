package exceptions;

public class MetotIcindeHata {

    public static void main(String[] args) {

        try {
            hataolustur();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

        }
    }


    private static void hataolustur() {

        String[] dizi = {"abc", "234", null, "bdc"};

        for (int i = 0; i < dizi.length + 2; i++) {

            try {
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            } catch (NumberFormatException hata) {
                System.out.println(hata);
            } catch (NullPointerException hata) {
                System.out.println(hata);

            }

        }

        System.out.println("hata oluştur metodunun sonu."); // Bu ibareyi göremiyoruz programı çalıştırınca. Bunun sebebi  ArrayOFB hatasını aldıktan sonra
        // program hatayı direkt basmıyor, bir sonraki catchi arıyor (üst metoda gidiyor burada)
        // ve catchi bulursa oradan çalışmaya devam ediyor
    }
}



