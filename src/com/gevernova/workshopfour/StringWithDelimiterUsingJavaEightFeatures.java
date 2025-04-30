package com.gevernova.workshopfour;

import java.util.*;
import java.util.stream.Collectors;

public class StringWithDelimiterUsingJavaEightFeatures {
    public static void main(String [] args) {
        List<String> cities= Arrays.asList("Delhi", "Mumbai", "Chennai");
        String ans="Cities:"+cities.stream().collect(Collectors.joining(","));
        System.out.println(ans);

    }
}
