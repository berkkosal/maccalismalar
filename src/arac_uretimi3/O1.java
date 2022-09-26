package arac_uretimi3;

class O1 extends Otomobil {

    public O1(String modelAdi, int motorHacmi, Klima klima, String vitesTuru) {
        super(modelAdi, motorHacmi,klima,vitesTuru);
    }

    @Override
    void gazaBas() {
        if (isTasitCalisiyorMu() && getAnlikHiz() < 180) {
            setAnlikHiz(getAnlikHiz() + 20);
            System.out.println("Anlık hızınız: " + getAnlikHiz());
        } else {
            System.out.println("Motor çalışmıyor ya da hız limitini aştınız.");
        }

    }

    @Override
    void freneBas() {

        if (isTasitCalisiyorMu() && getAnlikHiz() > 0) {
            setAnlikHiz(getAnlikHiz() - 20);
            System.out.println("Anlık hızınız: " + getAnlikHiz());
        } else {
            System.out.println("Motor çalışmıyor ya da duruyorsunuz.");
        }

    }

    @Override
    void araciCalistir() {
        if (!isTasitCalisiyorMu()) {
            setTasitCalisiyorMu(true);
        }


    }

    @Override
    void araciDurdur() {
        if (isTasitCalisiyorMu()) {
            setTasitCalisiyorMu(false);
        }

    }

    @Override
    void ozellikleriGoster() {
        System.out.println("Aracın durumu: " + isTasitCalisiyorMu());
        System.out.println("Aracın üretim yılı: " + getUretimYili());
        System.out.println("Aracın maksimum hızı: " + getMaksimumHiz());
        System.out.println("Aracın anlık hızı: " + getAnlikHiz());
        System.out.println("Aracın yakıt tüketimi: " + getYakitTuketimi());
        System.out.println("Aracın motor hacmi: " + getMotorHacmi());
    }
}
