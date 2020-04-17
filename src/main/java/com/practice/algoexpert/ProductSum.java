package com.practice.algoexpert;


import java.util.ArrayList;
import java.util.List;

/*Write a function that takes in a "special" array and returns its product sum.
      A "special" array is a non-empty array that contains either integers or other
      "special" arrays. The product sum of a "special" array is the sum of its
      elements, where "special" arrays inside it are summed themselves and then
      multiplied by their level of depth.
       = [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
       <span class="CodeEditor-promptComment">// calculated as: 5 + 2 + 2 * (7 - 1) + 3 + 2 * (6 + 3 * (-13 + 8) + 4)</span>*/
public class ProductSum {

      public static int productSum(List<Object> array){
          int level = 1;
          return productSum(array,level);
      }

      private static int productSum(List<Object> arr, int mul){
          int sum = 0 ;
          for(Object o : arr){
              if(o instanceof ArrayList){
                  ArrayList<Object> list = (ArrayList<Object>)o;
                  int temp = productSum(list,mul+1);
                  sum += mul*temp;
              }else {
                  Integer in = (Integer) o;
                  sum = sum + (mul * in.intValue());
              }
          }
          return sum;
      }
}
