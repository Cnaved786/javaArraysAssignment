public class Question4 {
    public static void main(String[] args) {
        int[] arr={2, -3, 5, 8, 1, 0,-4};
        //let maximum element in integers
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("Minimum Element in array is :"+min);

    }
}
