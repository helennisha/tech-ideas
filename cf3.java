import java.util.Scanner;

public class cf3 {
    //Count digits in a numbers
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
            System.out.println("Enter you number");
            int q,num=sc.nextInt(),count=0;
//8976
            while(num>1){
                q=num/10;
                
               ;
                num=q;
                count++;
            }
            System.out.println(count);
    }
}
