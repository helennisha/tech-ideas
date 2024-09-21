import java.util.Arrays;

public class cf20 {
    //ROTATE K TIMES
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6};int k=1;
        int B[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(i+k>=A.length){
                B[(i+k)%A.length]=A[i];
            }
            else{B[i+k]=A[i];}
        }
        System.out.println(Arrays.toString(B));
    }
}
