import java.time.LocalDate;

public class SimpleClasse {
    public static void main(String[] args) {
        new SimpleClasse().add(1, 2);
        DateUtils.isNowBetween(LocalDate.MIN, LocalDate.MAX);
        DateUtils.isDateBetween(LocalDate.of(2019, 1, 1), LocalDate.MIN, LocalDate.MAX);
    }
    /**
     * Adds a and b
     *
     * @param firstNumber the first number
     * @param b           the second number
     */
    public int add(int firstNumber, int b) {
        return firstNumber + b;
    }

}
