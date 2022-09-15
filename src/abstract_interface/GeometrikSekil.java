package abstract_interface;

public abstract class GeometrikSekil {

    private int birinciKenar;
    private int hesaplananAlan;

    abstract public void cevreHesapla();

    abstract public void alanHesapla();

    public GeometrikSekil(int birinciKenar){
        this.birinciKenar =birinciKenar;
    }

    public GeometrikSekil(){

    }

    public int getHesaplananAlan() {
        return hesaplananAlan;
    }

    public void setHesaplananAlan(int hesaplananAlan) {
        this.hesaplananAlan = hesaplananAlan;
    }

    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }


}
