import java.util.Scanner;
//find last digit of number
public class cf2 {
    Scanner sc=new Scanner(System.in);

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter you number");
            int num=sc.nextInt();

        int last_dig;
        last_dig=num%10;
        System.out.println( "The last digit is "  + last_dig);

    }
}
