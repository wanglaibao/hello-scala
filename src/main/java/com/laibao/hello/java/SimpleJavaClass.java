package com.laibao.hello.java;

import java.util.List;

public class SimpleJavaClass {

    private String name;

    public SimpleJavaClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static SimpleJavaClass create(String name) {
        return new SimpleJavaClass(name);
    }

    /**
     *
     * @param temperatures
     * @return int
     */
    public static int findMax(List<Integer> temperatures) {
        int highTemperature = Integer.MIN_VALUE;
        for(int temperature : temperatures) {
            highTemperature = Math.max(highTemperature, temperature);
        }
        return highTemperature;
    }
}
