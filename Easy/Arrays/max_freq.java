import java.util.Scanner;
import java.util.Arrays;
public class max_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        int freq = 1;
        int number = arr[0];
        for(int j = 0;j<num-1;j++)
        {
            if(arr[j] == arr[j+1])
            {
                count++;
                if(count>freq)
                {
                    freq = count;
                    number = arr[j];
                }
            }
            else
                count = 1;
        }
        System.out.println("The element with the most frequency is "+number+" and it has been repeated "+freq+" times");
    }    
}
