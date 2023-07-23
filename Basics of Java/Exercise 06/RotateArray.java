class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        rotate(arr,3);
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    // METHOD FOR REVERSING THE ARRAY
    public static void reverse(int arr[],int low,int high){
        while (low < high) {
            
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            
            low++;
            high--; 
        }
    }
    // METHOD FOR ROTATION
    public static void rotate(int arr[],int roataions){
        int length = arr.length;
        roataions = roataions % 10;
        reverse(arr,0,length-roataions-1);
        reverse(arr,length-roataions,length-1);
        reverse(arr,0,length-1);
    }
}
//SPACE COMPLEXITY - O(1)
// TIMECOMPLEXITY - O(N)


// intutuon bheind the reversing approach is that if we rotate some elements by k position 
//from back of array and some length - k(No of roatation) from start of array then it 
//will result in a roatated array 