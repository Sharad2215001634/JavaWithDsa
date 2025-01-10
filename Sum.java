import java.util.*;
public class Sum {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.print("The sum o the two number is : ");
        System.out.println(c);
        sc.close();
    }
}
