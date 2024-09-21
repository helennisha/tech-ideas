public class cf15 {
    //search for an element in an array
    public static void main(String[] args) {
        int num=13,count=0;
        int A[]={10,65,657,1,6785,7,0,3};
        for(int i=0;i<A.length;i++){
            if(A[i]==num){System.out.println("the num  " +num+ " is in this array");
        count++;
        }
           
        }
       if(count==0) System.out.println("num is not in the array");
    }
}
