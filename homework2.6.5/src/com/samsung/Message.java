package com.samsung;

public interface Message {

    int maxSize = 0;

    void send();

    void delete(int number);

    String read(int number);
}
