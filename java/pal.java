public class pal {
    public static void main(String[] args) {
        int n=2131,rev = 0,rem;
        int c=n;
        while (n != 0) {
            rem = n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        if(rev==c)
        {
            System.out.println(c+" is a palindrom");
        }
        else
        {
            System.out.println(c+" not a palindrom");

        }
    }
}
