public class cf21 {
    //subset
    public static void main(String[] args) {
        int count=0;
        int A[]={2,4,6,1,3,8};
        int B[]={2,6,7,3};
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]){
                    count++;
                }
            }
        }
        if(count==B.length){System.out.println("is a subset");}
        else{System.out.println("not a subset");}
    }
}
