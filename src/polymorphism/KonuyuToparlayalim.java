package polymorphism;

public class KonuyuToparlayalim {

    public static void main(String[] args) {

        Canli canli =  new Canli();
        canli.adiniSoyle();

        Kartal kartal = new Kartal();
        kartal.adiniSoyle();
        kartal.uc();

        Panda panda = new Panda();
        panda.adiniSoyle();
        panda.oyna();

    }






}
