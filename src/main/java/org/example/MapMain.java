package org.example;

import example.maps.MapExample;

import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        MapExample.MapsExample message = MapExample.MapsExample.newBuilder()
                .putIds("my id 1", generateIdWrapper(1))
                .putAllIds(Map.of(
                        "my id 2", generateIdWrapper(2),
                        "my id 3", generateIdWrapper(3)
                ))
                .build();

        System.out.println(message);
    }

    private static MapExample.IdWrapper generateIdWrapper(int id) {
        return MapExample.IdWrapper.newBuilder().setId(id).build();
    }
}
