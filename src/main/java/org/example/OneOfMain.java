package org.example;

import example.oneof.Oneof;

public class OneOfMain {
    public static void main(String[] args) {
        Oneof.Result message = Oneof.Result.newBuilder()
                .setMessage("a message")
                .build();

        System.out.println("hasMessage: " + message.hasMessage());
        System.out.println("hasMessage: " + message.hasId());
        System.out.println(message);

        Oneof.Result message2 = Oneof.Result.newBuilder(message)
                .setId(42)
                .build();

        System.out.println("hasMessage: " + message2.hasMessage());
        System.out.println("hasMessage: " + message2.hasId());
        System.out.println(message2);

        Oneof.Result message3 = Oneof.Result.newBuilder(message)
                .setId(42)
                .setMessage("a message") //only this one will be set
                .build();

        System.out.println("hasMessage: " + message3.hasMessage());
        System.out.println("hasMessage: " + message3.hasId());
        System.out.println(message3);
    }
}
