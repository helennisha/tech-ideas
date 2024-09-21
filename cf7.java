import java.util.Scanner;

public class cf7 {
    //print all divisors of a number 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter you number");
            int num=sc.nextInt();
        System.out.println("the divisors of given number are");
        for(int i=1;i<=50;i++){
            if(num%i==0){
                System.out.print(i+ " , ");
            }
        }
    }
}
