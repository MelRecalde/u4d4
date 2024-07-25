public class Dipendente {

    private String freshman;
    private double salary;
    private Department department;

    public Dipendente(String freshman, double salary, Department department) {
        this.freshman = freshman;
        this.salary = salary;
        this.department = department;
    }

    public String getFreshman() {
        return freshman;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "freshman: '" + freshman + '\'' +
                " , salary: " + salary +
                " , department: " + department +
                '}';
    }

    public void printData() {
        System.out.println("Freshman: " + this.freshman);
    }
}
