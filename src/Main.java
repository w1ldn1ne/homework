public class Main {
    public static void main(String[] args) {
        var fullTime = 640;
        var timeOne = 8;
        var people = fullTime / timeOne;
        System.out.println("Всего работников в компании - " + people + " человек.");
        var peoplePlus = people + 94;
        var timeOnePlus = fullTime / peoplePlus;
        System.out.println("Если в компании работает " + peoplePlus + " человека, то всего " + timeOnePlus + " часа работы может быть поделено между сотрудниками.");
    }
}