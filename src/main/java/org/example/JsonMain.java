package org.example;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.simple.SimpleOuterClass;

import java.util.List;

public class JsonMain {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        SimpleOuterClass.Simple message = SimpleOuterClass.Simple.newBuilder()
                .setId(42)
                .setName("a name")
                .setIsSimple(true)
                .addAllSimpleList(List.of(1,2,3))
                .build();

        String json = toJson(message);
        System.out.println(json);
        System.out.println(fromJson(json));
    }

    private static String toJson(SimpleOuterClass.Simple message) throws InvalidProtocolBufferException {
        return JsonFormat.printer()
//                .omittingInsignificantWhitespace()
//                .includingDefaultValueFields()
                .print(message);
    }

    private static SimpleOuterClass.Simple fromJson(String json) throws InvalidProtocolBufferException {
        SimpleOuterClass.Simple.Builder builder = SimpleOuterClass.Simple.newBuilder();
        JsonFormat.parser().merge(json, builder);
        return builder.build();
    }
}
