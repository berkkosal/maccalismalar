package abstract_interface;

class Kare extends GeometrikSekil {


    public Kare(int kenar) {
        this.setBirinciKenar(kenar);
    }


    @Override
    public void cevreHesapla() {

        System.out.println("Karenin çevresi: " + getBirinciKenar() * 4);


    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar() * getBirinciKenar());
        System.out.println("Karenin alanı: " + getHesaplananAlan());
    }


    public void adiniSoyle() {
        System.out.println("Ben bir kare sınıfı nesnesiyim.");
    }


}

