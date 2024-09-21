public class cf12 {
    //perfect number 6,28,496,8128
    public static void main(String[] args) {
        int f=0,num=28;
        for(int i=1;i<num;i++){
            if(num%i==0){
               f=f+i;
            }
        }
        if(f==num){System.out.println("perfect number");}
        else{System.out.println("not a perfect number ");}
    }
}
