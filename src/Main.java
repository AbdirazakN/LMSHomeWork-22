import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //ArrayList тузунуз. 1ден 100го чейинки 50 сан менен толтурунуз
        //Дагы 2 ArrayList тузуп бирисине жогорудагы келген сандардын так сандардын, экинчисине жуп сандардын салыныз
        //Аларды консольго чыгарыныз


        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        Random random = new Random();

        for (int i = 1; i <= 50; i++) {
            int number = random.nextInt(1,100);
            numbers.add(number);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }else {
                oddNumbers.add(number);
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("All numbers to 100:  "+numbers);
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("Even numbers:  "+evenNumbers);
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("Odd numbers:  "+oddNumbers);
        System.out.println("~~~~~~~~~~~~~~~~~~~");
    }
}