package arac_uretimi4_son;

public class M1 extends Minibus {

    public M1() {

        super("M1", 4);

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
