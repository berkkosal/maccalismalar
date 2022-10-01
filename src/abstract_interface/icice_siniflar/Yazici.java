package abstract_interface.icice_siniflar;

public class Yazici {

    private int privateDegisken = 1;
    int defaultDegisken = 2;
    protected int protectedDegisken = 3;
    public int publicDegisken = 4;

    private void privateMetot() {
        StringDiziYazdir nesne = new StringDiziYazdir();
        System.out.println(nesne.privateDegiskenDahili);
        System.out.println(nesne.defaultDegiskenDahili);
        System.out.println(nesne.protectedDegiskenDahili);
        System.out.println(nesne.publicDegiskenDahili);

    }

    void defaultMetot() {
    }

    protected void protectedMetot() {
    }

    public void publicMetot() {
    }

    private class StringDiziYazdir {

        private int privateDegiskenDahili = 1;
        int defaultDegiskenDahili = 2;
        protected int protectedDegiskenDahili = 3;
        public int publicDegiskenDahili = 4;

        private void stringDiziYazdir(String[] dizi) {

            System.out.println(privateDegisken);
            System.out.println(defaultDegisken);
            System.out.println(protectedDegisken);
            System.out.println(publicDegisken);

            privateMetot();
            defaultMetot();
            protectedMetot();
            publicMetot();

            for (String gecici : dizi) {
                System.out.println(gecici);
            }
        }

    }
}
