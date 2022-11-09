public class WhileLoopfun {
    public WhileLoopfun() {

    }
    public void printDigits(int number) {
        int updatedNum = number;
        while (updatedNum > 0) {
            System.out.println(updatedNum % 10);
            updatedNum = updatedNum/10;
        }
    }
    public int countLetter(String word, String letter) {
        int counter = 0;
        int index = 0;
        while (index < word.length()) {
            String word2 = word.substring(index, index+1);
            if (word2.equals(letter)) {
                counter++;
            }
            index++;
        }
        return counter;
    }
    public int maxDoubles(int number, int threshold) {
        int counter = 0;
        if (threshold < number) {
            return 0;
        }
        while (number <= threshold) {
           number = number * 2;
           counter++;
        }
        return counter-1;
    }
    public boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        int factor = 2;
        while (factor < number) {
            if (number % factor == 0) {
                return false;
            }
            factor++;
        }
        return true;
    }

}
