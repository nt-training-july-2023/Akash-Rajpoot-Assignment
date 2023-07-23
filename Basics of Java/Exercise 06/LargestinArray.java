import java.util.Scanner;

public class LargestinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements of array");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int maxElement  = 0;
        //COMPARING ELEMENT WITH EACH ITERARYION AND UPDATING THE VALUE OF MAX
        for(int i=0;i<5;i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println(maxElement);
    }    
}
