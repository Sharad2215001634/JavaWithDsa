import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Your Full Name : ");
        String name = sc.nextLine();
        for(int i = 0; i < name.length(); i++ ){
            System.out.print(name.charAt(i));
        }

        sc.close();
    }
}
