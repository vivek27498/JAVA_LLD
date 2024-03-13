package LiskovSubstitution;

public class Main {
    public static void main(String[] args) {

        Employee pm = new PermanentEmployee(2000,"Vivek");
        Employee tm = new TemporaryEmployee(1000,"Sakshi");

        //below line throws error because Contract employee class implements commonEmployeeOnly
        //
        //Employee cm = new ContractEmployee();

        System.out.println("Vivek Bonus--"+pm.CalculateBonus(2000));
        System.out.println("Sakshi Bonus--"+tm.CalculateBonus(2000));
    }
}
