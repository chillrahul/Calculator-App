public class CountNum {
    public static void main(String[] args) {
        int count =0;
        //Find teh no of 7 in a didgit
        int digit= 7345777;
        while(digit > 0){
          int rem = digit%10;
          if(rem == 7){
            count ++;
          }
          digit =digit/10;
        }
        System.out.println(count);

    }
}
