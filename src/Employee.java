public class Employee {

    private static int idGenerator = 0;
    private final int id;
    private final String fio;
    private int department;
    private int salary;


    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++idGenerator;
    }
    public int getId() {
        return id;
    }
    public String getFio() {
        return fio;
    }
    public int getDepartment() {
            return department;
        }

    public int getSalary() {
        return salary;
    }
    public void setDepartment (int department) {
        if (department > 0 && department <= 5 ) {
            this.department = department;
        }
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}


