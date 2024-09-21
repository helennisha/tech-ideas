public class cf18 {
    //sort an array in order to 0s 1s 2s 
    public static void main(String[] args) {
        int temp;
        int B[]={2,1,0,2,0,1};
        for(int i =0;i<B.length;i++){
            for(int j=i+1;j<B.length;j++){
                if(B[i]>B[j]){
                      temp=B[i];
                      B[i]=B[j];
                      B[j]=temp;
                }
            }
            System.out.print(B[i]  +" ");
        }
    }
}
