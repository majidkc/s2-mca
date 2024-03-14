public class prim {
    public static void main(String[] args) {
        int n=17;
        boolean ip = true;
        for(int i = 2; i <n/2 +1;i++)
        {
            if (n%i==0)
            {
                ip=false;
                break;
            }
        }
        if(ip)
        {
            System.out.println(n+" is prime");
        }
        else
        {
            System.out.println(n+" not prime");

        }
    }
}
