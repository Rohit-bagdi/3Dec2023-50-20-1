/*
169. Majority Element
Solved
Easy
Topics
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/


//java 8

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Solution {
    public int majorityElement(int[] num) {
int n = num.length/2;
	 
	Optional<Integer>  adds = Arrays.stream(num).boxed().collect(Collectors.groupingBy(i ->(int) i,Collectors.counting())).entrySet().stream()
			  .filter(e -> (e.getValue()>n))
			  .map(Map.Entry::getKey)
			  .findFirst();
 int result = adds.isPresent()? adds.get():-1; 

return result;
    }


//NOrmal

public class Solution {
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
}

}




