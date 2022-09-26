package arac_uretimi3;

abstract class Minibus extends Tasit {


    private final int maksimumHiz = 160;


    public Minibus(String modelAdi, int motorHacmi, Klima klima) {
        super(modelAdi, motorHacmi, klima);
    }
}
