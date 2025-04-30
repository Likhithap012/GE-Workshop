package com.gevernova.workshopthree;

import java.sql.SQLOutput;
import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");

        //convert to either upper or lowercase
        String sentence = sc.nextLine().toLowerCase();

        //placing the elements in the array
        sentence=sentence.replace("-"," ");

        String[] words = sentence.split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String,Integer>>list=new ArrayList<>(wordCount.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());

        // display result
        for (Map.Entry<String,Integer>entry:list) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
