

public class problem_4 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                count += 1;
            }
        }
        System.out.println(count);


    }
}
