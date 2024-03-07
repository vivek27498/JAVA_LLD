public class Main {
    public static void main(String[] args) {

        Employee pm = new PermanentEmployee(2000,"Vivek");
        Employee tm = new TemporaryEmployee(1000,"Sakshi");

        System.out.println("Vivek Bonus--"+pm.CalculateBonus(2000));
        System.out.println("Sakshi Bonus--"+tm.CalculateBonus(2000));
    }
}
