package generics.veteriner_birligi;

import java.util.ArrayList;

public class SehirVeterinerlikleri {

    private String sehir;
    private int toplamVeterinerSayisi;
    private ArrayList<Veteriner> sehirdekiVeterinerler;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler = new ArrayList<>();
        toplamVeterinerSayisi = 0;
    }

    public void sehirdekiToplamVeterinerSayisiniBul() {

        System.out.println("Toplam veteriner sayısı: " + sehirdekiVeterinerler.size());
    }

    public void sehireVeterinerEkle(Veteriner veteriner) {
        sehirdekiVeterinerler.add(veteriner);
    }
}
