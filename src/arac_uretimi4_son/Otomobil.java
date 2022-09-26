package arac_uretimi4_son;


abstract class Otomobil extends Tasit {

    private Vites vites;
    private static int uretilenOtomobilSayisi;


    public Otomobil(String modelAdi, int motorHacmi, Vites vites, String klima) {
        super(modelAdi, motorHacmi, 180,klima);
        this.vites = vites;
        uretilenOtomobilSayisi++;
    }


    @Override
    public void gazaBas() {
        if (!isCalisiyorMu()) return;
        setoAnkiHiz(getoAnkiHiz() + 20);
        System.out.println("Anlık hızınız: " + getoAnkiHiz());

    }

    @Override
    public void freneBas() {
        if (isCalisiyorMu()) {
            setoAnkiHiz(getoAnkiHiz() - 20);
            System.out.println("Anlık hızınız: " + getoAnkiHiz());
        }

    }

    public Vites getVites() {
        return this.vites;

    }


}
