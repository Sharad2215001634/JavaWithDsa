import java.util.Scanner;
public class CmpString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Word to check : ");
        String first = sc.next();
        System.out.print("Enter the Second Word to check : ");
        String second = sc.next();

        if(first.compareTo(second) == 0)
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

    }
    
}
