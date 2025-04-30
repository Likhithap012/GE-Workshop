package com.gevernova.workshopthree;


import java.util.ArrayList;

//Group Anagrams
//Problem: Given a list of strings, group the anagrams together.
//
//         Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//         Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert the string to a character array, sort it, then convert it back to a string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Use the sorted string as a key to group anagrams
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

