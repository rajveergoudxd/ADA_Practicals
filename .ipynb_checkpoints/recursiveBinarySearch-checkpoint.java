public class recursiveBinarySearch{

    public static int recursiveBinary(int[] arr, int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        // int mid = si + (ei-si)/2;
        int mid = (si+ei)/2;
        if(arr[mid]==target){
            return mid;
        } else if (arr[mid]>target){
            return recursiveBinary(arr, target, si,mid-1);
        } else{
            return recursiveBinary(arr, target, mid+1, ei);
        }
   
    }
    public static void main(String args[]){
        int[] arr = {23,45,67,89,98};
        int target = 89;

        int position_target = recursiveBinary(arr, target, 0, arr.length-1);
        System.out.println(position_target);
    }

}