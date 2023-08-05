import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(isItaPrime(7));
        System.out.println(isItaPrime(5));
        System.out.println(primeFactorial(1004565218));
    }

    public static boolean isItaPrime(int number) throws NotAPrimeNumberException {
        if (number == 0 || number == 1) {
            throw new NotAPrimeNumberException();
        }
        if (number < 1) {
            throw new IllegalArgumentException();
        }
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> primeFactorial(int number) {
        if (number <= 1) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        while (number > 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    result.add(i);
                    number /= i;
                    break;
                }
            }
        }
        return result;
    }
}