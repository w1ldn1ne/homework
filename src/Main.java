public class Main {
    public static void main(String[] args) {
        var weightFirstFighter = 78.2;
        var weightSecondFighter = 82.7;
        var fullWeight = weightFirstFighter + weightSecondFighter;
        var weightMinus = weightSecondFighter - weightFirstFighter;
        System.out.println("Общий вес = " + fullWeight);
        System.out.println("Разница в весе = " + weightMinus);
    }
}