public class cf9 {
   //armstrong number
   public static void main(String[] args) {
    int r,n=153,arms=0,number=n;
    while(n>0){
      r=n%10;
      n=n/10;
      arms=arms+r*r*r;
      

    }
   // System.out.println(arms);
    if(arms==number)
    System.out.println("Given number is a armstrong");
    else{
        System.out.println("not palindrome");
       }
   } 
   
}
