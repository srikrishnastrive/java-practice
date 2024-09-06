//Find whether an array is subset of another array

import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays arr1[] and arr2[] of size m and n respectively, the task is to determine whether arr2[] is a subset of arr1[]. Both arrays are not sorted, and elements are distinct.

Examples: 
Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
Output: Yes
Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4} 
Output: Yes
Input: arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3} 
Output: No
 */

 public class problem_1{
    public static boolean isSubsetUsingHasing(int[] arr1,int[] arr2){
        Set<Integer> hashset = new HashSet<>();
        for (int num : arr1){
            hashset.add(num);
        }
        //checking each element of arr2 in the hash set
        for(int num : arr2){
            if(!hashset.contains(num)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {11,1,13,21,3,7};
        int[] arr2 = {11,3,7,11};
        if(isSubsetUsingHasing(arr1, arr2)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }
 }
