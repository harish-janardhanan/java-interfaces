package com.hj.singleton;

public class SingeltonClient {

    public static void main(String[] args) {
        // SingletonBase singletonBase = new SingletonBase();

        SingletonBase object = SingletonBase.getInstance();
        object.showInstance();
    }


}
