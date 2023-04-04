import org.jetbrains.annotations.NotNull;

public class Question2 {
    public static void main(String[] args) {

        String[] array = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        //find the length of array by length property
          int n =  array.length;
          //traverse over all array
        for (int i=0;i<n;i++){
            //check condition for odd indexex
            if(i%2 !=0) {
                System.out.println(array[i]);
            }
            //close condition
        }
        //close for loop
        }
    }


