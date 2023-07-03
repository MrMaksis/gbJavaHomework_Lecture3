import java.util.ArrayList;
import java.util.List;

public class task_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(7);
        numbers.add(15);
        numbers.add(12);
        numbers.add(5);

        removeEvenNumbers(numbers);

        System.out.println("Минимальное значение: " + findMinValue(numbers));

        System.out.println("Максимальное значение: " + findMaxValue(numbers));

        System.out.println("Среднее значение: " + findAverageValue(numbers));
    }

    static void removeEvenNumbers(List<Integer> numbers) {
        numbers.removeIf(n -> n % 2 == 0);
    }

    static int findMinValue(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (min > current) {
                min = current;
            }
        }
        return min;
    }

    static int findMaxValue(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (max < current) {
                max = current;
            }
        }
        return max;
    }

    static double findAverageValue(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}