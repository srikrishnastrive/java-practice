/*
 * Union of two sorted arrays

Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.
The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.
Example 1
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

Output: [1, 2, 3, 4, 5, 7]

Explanation: The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
*/

import java.util.*;

class union{
    public int[] unionArray(int[] nums1, int[] nums2){

        List<Integer> UnionArrayList = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if(nums1[i] < nums2[j]){
                if(UnionArrayList.isEmpty() || UnionArrayList.get(UnionArrayList.size() -1) != nums1[i]){
                    UnionArrayList.add(nums1[i]);
                }
               
                i++;
            }
            else {
                if(UnionArrayList.isEmpty() || UnionArrayList.get(UnionArrayList.size() -1) != nums1[j]){
                    UnionArrayList.add(nums2[j]);
                }
                
                j++;
            }
            
        }
        while (i < n) {
            UnionArrayList.add(nums1[i]);
            i++; 
        }
        while (j < m) {
            UnionArrayList.add(nums2[j]);
            j++;
        }
        int[] Union = new int[UnionArrayList.size()];
        for (int k = 0; k < UnionArrayList.size(); k++ ){
            Union[k] = UnionArrayList.get(k);
        }
        return Union;
    }
}

public class problem_7 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {2, 3, 4, 4, 5, 11, 12};

        // Create an instance of the Solution class
        union finder = new union();

        /* Get the union of nums1 and 
        nums2 using the class method */
        int[] union = finder.unionArray(nums1, nums2);

        System.out.println("Union of nums1 and nums2 is:");
        for (int val : union) {
            System.out.print(val + " ");
        }
     
    }
}
