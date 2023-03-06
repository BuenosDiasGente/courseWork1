public class Employee {
    private String surname, name, patronymic;
    private int department;
    private double salary;

    private int id;
    static int counter=1;
    public Employee(String surname,String name, String patronymic,int department, double salary){
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
        this.department=department;
        this.salary=salary;
        this.id=counter++;
    }


    public String getSurname() {

        return this.surname;
    }

    public String getName() {

        return this.name;
    }

    public String getPatronymic() {

        return this.patronymic;
    }
    public int getDepartment() {

        return this.department;
    }

    public double getSalary() {

        return this.salary;
    }

    public int getId() {

        return this.id;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
