public class ReverseNum {
    public static void main(String[] args) {
        int n =12345;
        int rem =0;
        while(n>0){
            rem = 10*rem;
           int lastdigit=n%10;
            rem =rem+lastdigit;
            n=n/10;
            
        }
        System.out.println(rem);
    }
}
