public class cf13 {
// max and min elemnt in the array
public static void main(String[] args) {
    int temp;int A[]={10,65,657,1,6785,7,0,3};
    
    for(int i=0;i<A.length;i++){
        for(int j=i+1;j<A.length;j++){
            if(A[i]>A[j]){
               temp=A[i];
               A[i]=A[j];
               A[j]=temp;
            }
        }
       // System.out.println(A[i]);
    }
    System.out.println( "smallest element " +A[0]);
    System.out.println("biigest element  " +A[A.length-1]);
    //cf14
    System.out.println("the third largest  element  " +A[A.length-3]);
}}