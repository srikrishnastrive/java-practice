import java.util.ArrayList;
import java.util.List;


class Spiral {
    public List<Integer> spiralOrder (int[][] matrix){
        List<Integer> ans = new ArrayList<>();

        //number of rows 3
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0,left = 0;
        int bottom = n-1,right = m-1;

        while (top <= bottom && left <= right) {
            //left to right
            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]); //0[1]0[2]0[3]
                //123 right = 2, left = 0 
            }
            top++; //top = 1
            //top to bottom //right to bottom
            for (int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]); // 1[2] 2[2]
                // 6 9 
                //bottom = 2
            }
            right--; //right = 1
            //bottom to left
            if(top <= bottom){
                for (int i = right; i >= left; i-- ){
                    ans.add(matrix[bottom][i]); //2[1] 2[0]
                    //8 7
                    //
                }
                bottom--;
            }
            //bottom = 1 //top = 1
            if(left <= right){
                for (int i = bottom; i >= top;i--){
                    ans.add(matrix[i][left]); // 1[0] 
                }
                left++;
            }
            //left = 1


        }


        return ans;
    }
}
public class problem_9 {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        // Create an instance of the Solution class
        Spiral finder = new Spiral();
        
        // Get spiral order using class method
        List<Integer> ans = finder.spiralOrder(mat);
       
        System.out.print("Elements in spiral order are: ");
        for (int i = 0; i < ans.size(); ++i) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
