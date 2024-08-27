import java.util.Scanner;

class PrintNumberNto1 {
    public void backtrackNto1(int i, int n) {
        if (i > n) {
            return;
        }
        backtrackNto1(i + 1, n);
        System.out.println(i);
    }
}

public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintNumberNto1 pn = new PrintNumberNto1();
        pn.backtrackNto1(1, n);  // Start i from 1 instead of 0
        sc.close();
    }
}
