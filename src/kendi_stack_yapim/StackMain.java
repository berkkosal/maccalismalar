package kendi_stack_yapim;

import java.util.ArrayList;
import java.util.Objects;

public class StackMain {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        System.out.println(myStack.kacElemanVar());
        System.out.println(myStack.bosMu());
        myStack.push(432);
        myStack.push(2142);
        myStack.push(60569);
        myStack.push(4214);
        System.out.println(myStack.elemanGoster());
        myStack.yazdir();
        myStack.pop();
        myStack.pop();
        myStack.yazdir();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

    }



}
