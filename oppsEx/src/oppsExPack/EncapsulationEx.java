package oppsExPack;


class Employee {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Age should be greater than 18");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }
}

public class EncapsulationEx {
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        emp.setName("John");
        emp.setAge(25);
        emp.setSalary(5000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
