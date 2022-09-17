package abstract_interface;

import java.util.ArrayList;

public class CokluKalitimGerekliligi {
    public static void main(String[] args) {

        PopSarkiciOzellikleri popSarkici1 = new Tarkan();
        PopSarkiciOzellikleri popSarkici2 = new Hadise();

        PopSarkiciOzellikleri dizi[] = new PopSarkiciOzellikleri[5];
        dizi[0] = popSarkici1;
        dizi[1] = popSarkici2;

        ArrayList<PopSarkiciOzellikleri> sarkicilar = new ArrayList<>();
        sarkicilar.add(popSarkici1);
        sarkicilar.add(popSarkici2);


        popSarkici1.sahnedeDansEt();

        MuslumBaba muslum = new MuslumBaba();
        muslum.sahnedeSigaraIc();

    }
}


interface Kisi{

    void yemekYe();
    void sporYap();

}

abstract class Sarkici implements Kisi {
    abstract void sarkiSoyle();
}

interface ArabeskSarkiciOzellikleri {
    void sahnedeSigaraIc();
}

interface PopSarkiciOzellikleri {
    void sahnedeDansEt();
    void duetYap();
}

class Tarkan implements PopSarkiciOzellikleri {


    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}
    //////
    class ArabeskSarkici extends Sarkici {

        @Override
        void sarkiSoyle() {
            System.out.println("Arabesk şarkıcı şarkı söylüyor.");
        }

        @Override
        public void yemekYe() {

        }

        @Override
        public void sporYap() {

        }
    }

    class Hadise implements PopSarkiciOzellikleri{

        @Override
        public void sahnedeDansEt() {

        }

        @Override
        public void duetYap() {

        }
    }


    class PopSarkicisi extends Sarkici {

        @Override
        void sarkiSoyle() {
            System.out.println("Pop şarkıcısı şarkı söylüyor");
        }

        @Override
        public void yemekYe() {

        }

        @Override
        public void sporYap() {

        }
    }

    class MuslumBaba implements ArabeskSarkiciOzellikleri, PopSarkiciOzellikleri {

        @Override
        public void sahnedeSigaraIc() {

        }

        @Override
        public void sahnedeDansEt() {

        }

        @Override
        public void duetYap() {

        }
    }


