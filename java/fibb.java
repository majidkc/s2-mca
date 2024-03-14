class fibb{
    public static void main(String[] args) {
        int n1=0, n2=1, n=10;
        System.out.println("fibnocci sireas ");
        for(int i=0;i<n;i++){
            System.out.println(n1);
            int s = n1+n2;
            n1=n2;
            n2=s;
        }
    }
}