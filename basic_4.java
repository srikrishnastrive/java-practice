import java.util.*;

class SwitchcaseSolutoin{
    public void findTheDay(int day){
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

public class basic_4 {
    public static void main (String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int day = scanner.nextInt();
        SwitchcaseSolutoin s = new SwitchcaseSolutoin();
        s.findTheDay(day);
        

    }
}
