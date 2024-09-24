/**
 * Given two sorted arrays nums1 and nums2, return an array containing the intersection of these two arrays.
The intersection of two arrays is an array where all values are present in both arrays.
Example 1
Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]
Output: [1, 2]
Explanation: The elements 1, 2 are the only elements present in both nums1 and nums2
 */



 import java.util.*;

class Intersection{
     public int[] IntersectionArray(int[] nums1, int[] nums2){
 
         List<Integer> IntersectionList = new ArrayList<>();
         int[] visited = new int[nums2.length];
         for (int i = 0; i < nums1.length;i++){
            for (int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j] && visited[j] == 0 ){
                    IntersectionList.add(nums2[j]);
                    visited[j] = 1;
                    break;
                }
                else if (nums2[j] > nums1[i]){
                    break;
                }
            }
         }
         
        
       
        
         int[] Union = new int[IntersectionList.size()];
         for (int k = 0; k < IntersectionList.size(); k++ ){
             Union[k] = IntersectionList.get(k);
         }
         return Union;
     }

     public int[] intersectionArrayOpt(int[] nums1, int[] nums2){
        List<Integer> intersecList =new ArrayList<>();
        int i = 0, j =0 ;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j] ){
                i++;
            }
            else if (nums1[i] > nums2[j]){
                j++;
            }
            else{
                intersecList.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] intersection = new int[intersecList.size()];
        for (int k = 0; k < intersection.length; k++ ){
            intersection[k] = intersecList.get(k);
        }

        return intersection;
     }
}
public class problem_8 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2,2,3,5};
        int[] nums2 = {1,2,7};

        // Create an instance of the Solution class
        Intersection finder = new Intersection();

        /* Get the union of nums1 and 
        nums2 using the class method */
        int[] union = finder.IntersectionArray(nums1, nums2);

        System.out.println("INtersection of nums1 and nums2 is:");
        for (int val : union) {
            System.out.print(val + " ");
        }

        int[] interSection = finder.intersectionArrayOpt(nums1, nums2);
        System.out.println("INtersection of nums1 and nums2 is optimized:");
        for (int val: interSection){
            System.out.print(val + " ");
        }
     
    }
}
