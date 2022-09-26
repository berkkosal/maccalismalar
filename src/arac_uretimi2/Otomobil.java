package arac_uretimi2;

class Otomobil extends Tasit {

    private boolean aracCalisiyorMu;
    private String vitesTuru;



    public Otomobil(String modelAdi, int yakitTuketimi, int motorHacmi, String vitesTuru) {
        super(modelAdi, yakitTuketimi, motorHacmi);
        this.vitesTuru = vitesTuru;
    }

    @Override
    public void araciCalistir() {
        if (!aracCalisiyorMu) {
            aracCalisiyorMu = true;
        }

    }

    @Override
    public void araciDurdur() {
        if (aracCalisiyorMu) {
            aracCalisiyorMu = false;
        }

    }

    @Override
    public void freneBas() {

        if (aracCalisiyorMu && getAnlikHiz() > 0) {
            setAnlikHiz(getAnlikHiz() - 20);
            System.out.println("Aracınızın hızı: " + getAnlikHiz());
        } else System.out.println("Araç çalışmıyor ya da duruyor.");

    }

    @Override
    public void gazaBas() {
        if (aracCalisiyorMu && getAnlikHiz() < 180) {
            setAnlikHiz(getAnlikHiz() + 20);
            System.out.println("Aracınızın hızı: " + getAnlikHiz());
        } else System.out.println("Araç çalışmıyor ya da hız limitine ulaştınız");
    }

    public void isAracCalisiyorMu() {
        if (aracCalisiyorMu) {
            System.out.println("Aracınız çalışıyor.");
        } else {
            System.out.println("Aracınız çalışmıyor.");
        }

    }

}
