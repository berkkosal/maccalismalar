package abstract_interface;

class Kare extends GeometrikSekil {



    public Kare(int kenar){
        this.setBirinciKenar(kenar);
    }


    @Override
    public void cevreHesapla() {

        System.out.println("Karenin çevresi: " + getBirinciKenar()*4);


    }

    @Override
    public void alanHesapla() {
        System.out.println("Karenin alanı: " + getBirinciKenar()*getBirinciKenar());
    }
}
