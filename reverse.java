import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
        while(number != 0){
            int rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
            // break;
        }
        System.out.println(rev);
        sc.close();
    }
    
}
