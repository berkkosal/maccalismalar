package abstract_interface;

class Dikdortgen extends GeometrikSekil {

    private int ikinciKenar;

    public Dikdortgen(int kenar1, int kenar2){
        setBirinciKenar(kenar1);
        this.setIkinciKenar(kenar2);
    }

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }


    @Override
    public void cevreHesapla() {

    }

    @Override
    public void alanHesapla() {

    }
}
