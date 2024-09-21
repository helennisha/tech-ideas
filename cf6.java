public class cf6 {
    //GCD
    public static void main(String[] args) {
        int n1=65,n2=20,r=1;
        while(r>=1){
           r= n1%n2;
           n1=n2;
           n2=r;
        }
        System.out.println( "GCD of the given numbers is  "+n1);
    }
}
