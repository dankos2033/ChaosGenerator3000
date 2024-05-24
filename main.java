import java.util.Random;

public class RandomCodeGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }
        for (int number : randomNumbers) {
            System.out.println(number);
        }
    }
}
