import java.util.*;
public class AverageOfArray {

    public static int calculateAverage(int arr[]){
        int avg = 0;
        int sum = 0;
        //FIRST ITERATING TO CALCULATE SUM OF ENTIRE ARRAY 
        //ELEMETS THEN DIVINDING WITH THE LENGTH SO WE GET NO OF ELEMENTS DIVISION
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        avg = sum / (arr.length);
        return avg;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr [] = {9,2,9,4,9,6,7,8};
        System.out.println(calculateAverage(arr));
     }
}
