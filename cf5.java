public class cf5 {
    //find power of a number 
    public static void main(String[] args) {
        int r=0,n=3,t=5,num=1;
        for(int i=1;i<=t;i++){
            r=num*n ;
            num=r;
        }
        System.out.println(r);
    }
}
