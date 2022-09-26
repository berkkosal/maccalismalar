package arac_uretimi4_son;

abstract class Minibus extends Tasit {

    private static int uretilenKamyonSayisi;

    public Minibus(String modelAdi, int motorHacmi) {
        super(modelAdi, motorHacmi, 160,"Klimalı");
        uretilenKamyonSayisi ++;


    }

    @Override
    public void gazaBas() {

    }

    @Override
    public void freneBas() {

    }
}
