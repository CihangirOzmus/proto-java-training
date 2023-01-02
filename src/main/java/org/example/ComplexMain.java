package org.example;

import example.complex.ComplexOuterClass;

import java.util.List;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexOuterClass.Complex message = ComplexOuterClass.Complex.newBuilder()
                .setOneDummy(createDummy(1, "One Dummy"))
                .addAllDummies(List.of(
                        createDummy(2, "Second Dummy"),
                        createDummy(3, "Second Dummy"),
                        createDummy(4, "Second Dummy")
                ))
                .build();

        System.out.println(message);
    }

    private static ComplexOuterClass.Dummy createDummy(int id, String name) {
        return ComplexOuterClass.Dummy.newBuilder()
                .setId(id)
                .setName(name)
                .build();
    }
}
