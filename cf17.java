public class cf17 {
    //find repeating number in an array
    public static void main(String[] args) {
        int A[]={1,65,657,19,6785,65,0,3};
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    System.out.println("The repeating number is " +A[i]);
                }
            }
        }
    }
}
