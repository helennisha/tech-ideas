public class cf16 {
    //find the missing element
    public static void main(String[] args) {
        int B[]={1,2,3,4,5,6,7,9,10};
        int missing_element,summation1=0,n=10;
        int summation=(n*(n+1))/2;
        for(int i=0;i<B.length;i++){
            summation1=summation1+B[i];
        }
        missing_element=summation-summation1;
        System.out.println("Missing element is " +missing_element );
    }
}
