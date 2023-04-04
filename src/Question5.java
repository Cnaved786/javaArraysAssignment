public class Question5 {
    public static void main(String[] args) {
        int arr[]={1,1,3,4,2,3,5,7,0};
        //traverse all array by for loop
        //here we can not start zero element of array because array
        for (int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
