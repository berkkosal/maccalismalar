package arac_uretimi3;

class O2 extends Otomobil {

    public O2(String modelAdi, int motorHacmi, Klima klima, String vitesTuru) {
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
        if (isTasitCalisiyorMu()){
            setTasitCalisiyorMu(false);
        }

    }

    @Override
    void ozellikleriGoster() {

    }
}
