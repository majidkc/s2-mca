import java.util.Scanner;
public class arraysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("enter the element of array");
        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the element to search");
        int element = sc.nextInt();
        int flag = 0;
        for(int i=0; i<size;i++)
        {
            if (array[i]==element)
            {
                flag = 1;
                System.out.println("element found at index:"+i);   
                break;
            }
        }
        if (flag == 0)
        {
            System.out.println("Element not found!!!");    
        }
    }
    
}
