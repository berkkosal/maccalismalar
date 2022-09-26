package arac_uretimi;

class Minibus extends Arac {


    public Minibus(String modelAdi, int yakitTuketimi, int motorHacmi) {
        super(modelAdi, yakitTuketimi, motorHacmi);
    }

    @Override
    public void hizlan() {

        if (isAcikMi() && getOankiHiz() < 160) {
            setOankiHiz(getOankiHiz() + 10);
            System.out.println("Aracın anlık hızı" + getOankiHiz());
        } else System.out.println("Araç hızlanamıyor en yüksek hıza ulaştınız ya da motor çalışmıyor.");


    }

    @Override
    public void yavasla() {
        if (isAcikMi() && getOankiHiz() > 0) {
            setOankiHiz(getOankiHiz() - 10);
            System.out.println("Aracın anlık hızı: " + getOankiHiz());
        }
    }

    @Override
    public void calisiyorMu() {
        if (isAcikMi()) {
            System.out.println("Araç çalışıyor.");
        } else System.out.println("Araç çalışmıyor.");

    }

    @Override
    public void setOankiHiz(int oankiHiz) {

        if (oankiHiz < 161) {
            setOankiHiz(oankiHiz);
        } else {
            System.out.println("Aracın maksimum hızının üzerinde hız atanamaz.");
        }
    }
}
