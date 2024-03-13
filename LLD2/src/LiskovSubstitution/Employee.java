package LiskovSubstitution;

public abstract class Employee implements CommonEmployee,EmployeeWithBonus{

    public int salary = 0;
    public String name = "";

    Employee(int salary,String name)
    {
        this.name= name;
        this.salary=salary;
    }

    public abstract int CalculateBonus(int sal);


}

class PermanentEmployee extends Employee{

    PermanentEmployee(int salary, String name) {
        super(salary, name);
    }

    @Override
    public int CalculateBonus(int sal) {
        return (int) ((sal * 1.5)-sal);
    }

    @Override
    public int GetMinimumSalary() {
        return 1000;
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

    @Override
    public int GetMinimumSalary() {
        return 500;
    }
}

class ContractEmployee implements CommonEmployee{

    @Override
    public int GetMinimumSalary() {
        return 100;
    }
}