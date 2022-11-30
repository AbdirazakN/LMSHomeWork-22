import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList тузунуз. 1ден 100го чейинки 50 сан менен толтурунуз
        //Дагы 2 ArrayList тузуп бирисине жогорудагы келген сандардын так сандардын, экинчисине жуп сандардын салыныз
        //Аларды консольго чыгарыныз


        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }else {
                oddNumbers.add(i);
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