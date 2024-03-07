public abstract class Employee {

    public int salary = 0;
    public String name = "";

    // here we could have added an employee type string to calculate the type of bonus
    // but instead ewe create an abstract class to implement the same in inherited class to
    // add a new feature and not disturb the old premise.

    Employee(int salary,String name)
    {
        this.name= name;
        this.salary=salary;
    }

    abstract int CalculateBonus(int sal);

}

class PermanentEmployee extends Employee{

    PermanentEmployee(int salary, String name) {
        super(salary, name);
    }

    @Override
    public int CalculateBonus(int sal) {
        return (int) ((sal * 1.5)-sal);
    }
}

class TemporaryEmployee extends Employee{

    TemporaryEmployee(int salary, String name) {
        super(salary, name);
    }

    @Override
    public int CalculateBonus(int sal) {
        return (int) ((sal * 1.1)-sal);
    }
}