package usta_sifu_egzersizler;

public class Controller {

    //singeleton, eager, lazy ==> design patternlere bak.
    private Controller(){

    }

    private static Controller nesne;

    public static Controller getInstance(){
        if(nesne==null){
            nesne = new Controller();
        }
        return nesne;
    }


}
