public class Main {
    public static void main(String[] args) {
        var weightFirstFighter = 78.2;
        var weightSecondFighter = 82.7;
        var weightOver = weightSecondFighter % weightFirstFighter;
        System.out.println("Остаток = " + weightOver);
    }
}