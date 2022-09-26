package arac_uretimi;

class Kamyon extends Arac {

    private int tekerSayisi;
    private int yukKapasitesi;
    private boolean damper;


    public Kamyon(String modelAdi, int yakitTuketimi, int motorHacmi, int tekerSayisi, int yukKapasitesi, boolean damper) {
        super(modelAdi, yakitTuketimi, motorHacmi);
        this.tekerSayisi = tekerSayisi;
        this.yukKapasitesi = yukKapasitesi;
        this.damper = damper;
    }

    public Kamyon(String modelAdi, int yakitTuketimi, int motorHacmi, int tekerSayisi, int yukKapasitesi) {
        super(modelAdi, yakitTuketimi, motorHacmi);
        this.tekerSayisi = tekerSayisi;
        this.yukKapasitesi = yukKapasitesi;
    }

    @Override
    void hizlan() {

        if (isAcikMi() && getOankiHiz() < 120) {
            setOankiHiz(getOankiHiz() + 5);
            System.out.println("Aracın anlık hızı: " + getOankiHiz());
        } else System.out.println("Araç hızlanamıyor en yüksek hıza ulaştınız ya da motor çalışmıyor.");

    }

    @Override
    void yavasla() {
        if (isAcikMi() && getOankiHiz() > 0) {
            setOankiHiz(getOankiHiz() - 5);
            System.out.println("Aracın anlık hızı: " + getOankiHiz());
        }


    }

    @Override
    void calisiyorMu() {

        if (isAcikMi()) {
            System.out.println("Araç çalışıyor.");
        } else System.out.println("Araç çalışmıyor.");


    }


    @Override
    public void setOankiHiz(int oankiHiz) {
        if (oankiHiz < 121) {
            setOankiHiz(oankiHiz);
        } else {
            System.out.println("Aracın maksimum hızının üzerinde hız atanamaz.");
        }
    }

    public int getTekerSayisi() {
        return tekerSayisi;
    }

    public void setTekerSayisi(int tekerSayisi) {
        this.tekerSayisi = tekerSayisi;
    }

    public boolean isDamper() {
        System.out.println("Kamyonda damper var.");
        return damper;
    }


    public int getYukKapasitesi() {
        return yukKapasitesi;
    }

    public void setYukKapasitesi(int yukKapasitesi) {
        this.yukKapasitesi = yukKapasitesi;
    }
}
