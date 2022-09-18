package org.example.interfaces;

public interface Computable {
    default  int doubleNo(int num){
        return  num * 2;
    }

    int  getNo(int num);
}
