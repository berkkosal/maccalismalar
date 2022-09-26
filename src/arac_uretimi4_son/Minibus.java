package arac_uretimi4_son;

abstract class Minibus extends Tasit {

    private static int uretilenKamyonSayisi;

    public Minibus(String modelAdi, int motorHacmi) {
        super(modelAdi, motorHacmi, 160, "Klimalı");
        uretilenKamyonSayisi++;


    }

    @Override
    public void gazaBas() {
        if (!isCalisiyorMu()) return;
        setoAnkiHiz(getoAnkiHiz() + 10);
        System.out.println("Anlık hızınız: " + getoAnkiHiz());

    }

    @Override
    public void freneBas() {
        if (isCalisiyorMu()) {
            setoAnkiHiz(getoAnkiHiz() - 10);
            System.out.println("Anlık hızınız: " + getoAnkiHiz());
        }
    }
}
