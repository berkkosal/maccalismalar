package arac_uretimi3;

abstract class Kamyon extends Tasit {

    private final int maksimumHiz = 120;

    public Kamyon(String modelAdi, int motorHacmi, Klima klima) {
        super(modelAdi, motorHacmi, klima);
    }


    public int getMaksimumHiz() {
        return maksimumHiz;
    }
}
