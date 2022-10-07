package generics.veteriner_birligi;

import java.util.ArrayList;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        ilkNesneleriOlustur();


    }

    public static void ilkNesneleriOlustur() {
        Kedi kedi = new Kedi("01-01-2016", true, "Van Kedisi");
        Kedi kedi2 = new Kedi("05-02-2016", false, "Siyam");
        Kedi kedi3 = new Kedi("15-09-2016", true, "Tekir");

        Kopek kopek = new Kopek("02-06-2018", true, 1, "Golden");
        Kopek kopek2 = new Kopek("19-09-2017", true, 2, "Dalmaçyalı");
        Kopek kopek3 = new Kopek("12-02-2016", true, 4, "Pitbull");

        Musteri m1 = new Musteri("Mert", "123", "Ankara");
        m1.musteriyeHayvanEkle(kedi);
        m1.musteriyeHayvanEkle(kopek);

        Musteri m2 = new Musteri("Berk", "235", "İzmir");
        m2.musteriyeHayvanEkle(kedi2);
        m2.musteriyeHayvanEkle(kopek2);

        Musteri m3 = new Musteri("Seray", "642", "İstanbul");
        m3.musteriyeHayvanEkle(kedi3);
        m3.musteriyeHayvanEkle(kopek3);

        Veteriner v1 = new Veteriner("Ayşe", "985", "Ankara Üniversitesi", 7);
        v1.musteriEkle(m1);
        v1.musteriEkle(m2);

        Veteriner v2 = new Veteriner("Fatma", "235", "Çukurova Üniversitesi", 3);
        v2.musteriEkle(m1);
        v2.musteriEkle(m3);

        Veteriner v3 = new Veteriner("Hayriye", "875", "İstanbul Üniversitesi", 6);
        v3.musteriEkle(m3);

        v1.musterileriListele();

        SehirVeterinerlikleri ankara = new SehirVeterinerlikleri("Ankara");
        ankara.sehireVeterinerEkle(v1);
        ankara.sehireVeterinerEkle(v2);

        SehirVeterinerlikleri izmir = new SehirVeterinerlikleri("İzmir");
        izmir.sehireVeterinerEkle(v3);

        ankara.sehirdekiToplamVeterinerSayisiniBul();
        izmir.sehirdekiToplamVeterinerSayisiniBul();

        System.out.println("\n YÖNETİM PANELİ BAŞLIYOR\n");
        YonetimPaneli<Hayvan> hayvanYonetimPaneli = new YonetimPaneli<>();
        hayvanYonetimPaneli.bilgileriGoster(kedi);
        hayvanYonetimPaneli.bilgileriGoster(kopek3);

        YonetimPaneli<Musteri> musteriYonetimPaneli = new YonetimPaneli<>();
        musteriYonetimPaneli.bilgileriGoster(m1);

        musteriYonetimPaneli.sahipOlduguHayvanlariGoster(m1);


    }
}
