package org.example;

import com.example.option.AnotherDummy;

public class AnotherDummyMain {
    public static void main(String[] args) {
        AnotherDummy message = AnotherDummy.newBuilder()
                .setId(1)
                .build();
        System.out.println(message);
    }
}
