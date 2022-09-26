package arac_uretimi4_son;

abstract class Kamyon extends Tasit {

    private int yukKapasitesi;
    private int tekerSayisi;
    private String damper;
    private static int uretilenKamyonSayisi;




    public Kamyon(String modelAdi, int motorHacmi, int yukKapasitesi, int tekerSayisi, String damper) {
        super(modelAdi, motorHacmi, 120,"Klimalı");
        this.yukKapasitesi = yukKapasitesi;
        this.tekerSayisi = tekerSayisi;
        this.damper = damper;
        uretilenKamyonSayisi++;
    }


    @Override
    public void gazaBas() {
        if (!isCalisiyorMu()) return;
        setoAnkiHiz(getoAnkiHiz() + 5);
        System.out.println("Anlık hızınız: " + getoAnkiHiz());


    }

    @Override
    public void freneBas() {

        if (isCalisiyorMu()) {
            setoAnkiHiz(getoAnkiHiz() - 5);
            System.out.println("Anlık hızınız: " + getoAnkiHiz());
        }

    }

    public int getYukKapasitesi(){
        return this.yukKapasitesi;
    }


}
