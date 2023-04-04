public class Question3 {
    public static void main(String[] args) {
        int[] array= {1 ,2,3, 4,5, 6, 7,8};
        //traverse by for each loop
        for (int i :array){
            //check condition for even element
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
