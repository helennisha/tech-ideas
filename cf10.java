public class cf10 {
    //palindrome
    public static void main(String[] args) {
        int r,n=121,palindrome=0;
        while(n>0){
            r=n%10;
            palindrome=(palindrome*10)+r;
            n=n/10;
            
        }
        if(palindrome==n){System.out.println("given is a palindrome");}
        else{System.out.println("given is not a palindrome ");}
    }
}
