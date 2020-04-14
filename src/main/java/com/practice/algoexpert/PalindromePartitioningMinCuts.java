package com.practice.algoexpert;

import java.util.*;
import java.util.stream.Collectors;

public class PalindromePartitioningMinCuts {

    public static int palindromePartitioningMinCuts(String source){
        List<Character> charList = source.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        Map<Character,Integer> charCount = new HashMap<>();
        charList.stream().distinct().forEach(c -> charCount.put(c, Collections.frequency(charList,c)));
        Optional<Map.Entry<Character,Integer>>  temp = charCount.entrySet().stream().filter(e -> e.getValue()%2 == 1).findFirst();
        final Character oddChar = temp.isPresent() ? temp.get().getKey() : null ;
        int sum = 0;
        if(oddChar == null){
            sum = charCount.entrySet().stream().mapToInt(e -> e.getValue()).sum();
        }else{
            sum = charCount.entrySet().stream().
                mapToInt( e -> !e.getKey().equals(oddChar)&& e.getValue()%2 == 1 ? e.getValue()-1 : e.getValue()).sum();
        }
        return source.length()-sum;
    }
}
