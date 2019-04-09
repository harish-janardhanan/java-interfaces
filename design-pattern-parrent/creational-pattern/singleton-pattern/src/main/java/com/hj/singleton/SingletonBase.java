package com.hj.singleton;

public class SingletonBase {

    private SingletonBase(){}

    private static SingletonBase instance = new SingletonBase();

    public static SingletonBase getInstance(){
        return instance;
    }

    public void showInstance(){
        System.out.println("I am a singelton instance");
    }
}
