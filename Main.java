import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("The numbers are: " + uniqueNumbers);
        try {
            System.out.println("the sum of the numbers is: " + Calculator.addTogether(uniqueNumbers));
        }
        catch(IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("the average of the numbers is: " + Calculator.average(uniqueNumbers));
        }
        catch(IllegalArgumentException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Have a nice day.");
        }
    }
}
