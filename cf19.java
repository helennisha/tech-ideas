public class cf19 {
    //check two arrays are equal
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        int B[]={3,6,1,2,5};
        int count=0;
        if(A.length!=B.length){System.out.println("given arrays are not equal");}
        else{
              for(int i=0;i<A.length;i++){
                for(int j=0;j<B.length;j++){
                    if(A[i]==B[j]){
                        count++;
                    }
                }
              }
              if(count==A.length){System.out.println("given arrays are equal");}
              else{System.out.println("not equal");}




        }
    }
}
