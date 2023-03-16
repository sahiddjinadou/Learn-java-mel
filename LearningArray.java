import java.util.Arrays;
import java.util.Collections;

public class LearningArray {
    public static void main(String[] args) {
        Integer[] tab1 = {2, 1, 10};
        Integer[] tab2 = {3, 5, 7, 9};
        Integer[] tab3 = {-8, 25, 3, 5, 1};
        Integer[] tab4 = {};
        difSum(tab1);
        difSum(tab2);
        difSum(tab3);
        difSum(tab4);
    }

    public static void difSum(Integer[] tab) {
        //Initialize the variable to store the result
        int result = 0;
        //To reverse the array passed as arg
        Arrays.sort(tab, Collections.reverseOrder());
        //To 
        System.out.println(Arrays.toString(tab));
        
        for(int i = 0; i < tab.length; i++) {
            if(i == (tab.length - 1)){
                break;
            }
            result += (tab[(i)] - tab[(i+1)]);
            System.out.println("rest" + result);
            
            }
            System.out.println("rest" + result);


    }

}
