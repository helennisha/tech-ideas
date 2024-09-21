public class cf8 {
    //prime numbers
    public static void main(String[] args) {
        int limit=50,count=0;
        for(int i=2;i<=limit;i++){
            boolean isprime=true;
            for(int j=2;j<=i/2;j++){
                
                if(i%j==0 ){
                    isprime=false;
                    break;
                } 
                
            
        }
       
        if(isprime){System.out.print(i +" ,");}      
        }

    }
}
