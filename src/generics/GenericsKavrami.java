package generics;

import java.util.ArrayList;

public class GenericsKavrami {

    public static void main(String[] args) {

        // Bu kavram Java5 ile geldi.

        String[] isimler = {"emre", "ayşe", "ali"};
        Integer[] sayilar = {1, 5, 7, 9, 10};
        Character[] karakterler = {'a', 'b', 'k'};

       /* StringDiziYazdir.yazdir(isimler);
        IntegerDiziYazdir.yazdir(sayilar);
        CharDiziYazdir.yazdir(karakterler);
*/

        GenericDiziYazdir<String> stringGenericDiziYazdir = new GenericDiziYazdir<>();
        stringGenericDiziYazdir.yazdir(isimler);

        GenericDiziYazdir<Integer> integerGenericDiziYazdir = new GenericDiziYazdir<>();
        integerGenericDiziYazdir.yazdir(sayilar);

        GenericDiziYazdir<Character> characterGenericDiziYazdir = new GenericDiziYazdir<>();
        characterGenericDiziYazdir.yazdir(karakterler);


    }
}
