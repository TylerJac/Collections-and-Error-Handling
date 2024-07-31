import java.util.HashSet;
import java.util.Set;
public class Calculator {
    public static int addTogether(Set<Integer> input) {
        if(input.isEmpty()){
            throw new IllegalArgumentException("Empty set.");
        }else if (input.contains(null)){
            throw new IndexOutOfBoundsException("Numbers can't be null.");
        }
        int sum = 0;
        for (int num : input) {
            sum += num;
        }
        if (sum < 0 ){
            throw new IllegalArgumentException("Sum can't be negative.");
        }
        return sum;
    }
    public static int average(Set<Integer> input){
        int sum = addTogether(input);
        if (sum == 0) {
            throw new ArithmeticException("no dividing by zero");
        }
        else if (input.isEmpty()) {
            throw new IllegalArgumentException("Empty set.");
        }

        return sum / input.size();
    }
}
