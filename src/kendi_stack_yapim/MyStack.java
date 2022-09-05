package kendi_stack_yapim;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStack {

    private ArrayList<Object> liste;

    public MyStack(){
        this.liste = new ArrayList<>();
    }
    public int kacElemanVar(){
        return liste.size();
    }
    public boolean bosMu(){
        if(liste.size() == 0){
            return true;
        } else return false;
        // return liste.isEmpty();
    }
    public Object elemanGoster(){
        return liste.get(kacElemanVar()-1);
    }
    public Object pop(){
        if(kacElemanVar()>0){
            Object sonEleman = elemanGoster();
            liste.remove(kacElemanVar()-1);
            return sonEleman;
        }else{
            System.out.println("Yığın boş, pop yapılamaz.");
        } return null;
    }
    public void push (Object eklenecekSey){
        liste.add(eklenecekSey);
    }
    public void yazdir(){

        System.out.println("**************YIĞIN İÇERİĞİ**************");
        for (int i = 0; i < liste.size() ; i++) {
            System.out.println(i + ". indekste :" + liste.get(i));
        }

    }






}
