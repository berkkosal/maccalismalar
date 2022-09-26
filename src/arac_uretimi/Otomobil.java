package arac_uretimi;

class Otomobil extends Arac {


    public Otomobil(String modelAdi, int yakitTuketimi, int motorHacmi) {
        super(modelAdi, yakitTuketimi, motorHacmi);

    }


    @Override
    void hizlan() {
        if (isAcikMi() && getOankiHiz() < 180) {
            setOankiHiz(getOankiHiz() + 20);
            System.out.println("Aracın anlık hızı" + getOankiHiz());
        } else System.out.println("Araç hızlanamıyor en yüksek hıza ulaştınız ya da motor çalışmıyor.");

    }

    @Override
    void yavasla() {
        if (isAcikMi() && getOankiHiz() > 0) {
            setOankiHiz(getOankiHiz() - 20);
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

        if (oankiHiz < 181) {
            setOankiHiz(oankiHiz);
        } else {
            System.out.println("Aracın maksimum hızının üzerinde hız atanamaz.");
        }
    }
}
