public class cf4 {
    //reverse a number
    public static void main(String[] args) {
        int r,num=7896;
        while(num>0){
           
            r=num%10;
            num=num/10;
            System.out.print(r);
        }
    }
}
