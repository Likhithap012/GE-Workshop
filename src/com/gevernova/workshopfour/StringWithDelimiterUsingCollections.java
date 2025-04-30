package com.gevernova.workshopfour;

import java.util.Arrays;
import java.util.List;

public class StringWithDelimiterUsingCollections {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("Delhi","Mumbai","Chennai");
        String str="cities:";
        int size=cities.size();
        int cnt=0;
        for(String s:cities){
            cnt++;
            str+=s;
            if(cnt<size){
                str+=",";
            }
        }
        System.out.println(str);
    }
}
