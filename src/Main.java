import java.util.Arrays;

public class Main {
    private static Employee[] employeeDatabase = new Employee[10];
    public static void main(String[] args) {

        employeeDatabase[0] = new Employee("Petrov", "Ivan", "Vasilievich", 3, 33000);
        employeeDatabase[1] = new Employee("Ivanov", "Petr", "Vasilievich", 4, 39080);
        employeeDatabase[2] = new Employee("Petrov", "Sergiy", "Vasilievich", 3, 20000);
        employeeDatabase[3] = new Employee("Petrov", "Dmitrii", "Vasilievich", 2, 78000);
        employeeDatabase[4] = new Employee("Kyznecov", "Ivan", "Dmitrievich", 3, 35500);
        employeeDatabase[5] = new Employee("Maksimov", "Ivan", "Vasilievich", 1, 37800);
        employeeDatabase[6] = new Employee("Petrov", "Ivan", "Vasilievich", 3, 53000);
        employeeDatabase[7] = new Employee("Sokolov", "Ivan", "Vasilievich", 5, 100000);
        employeeDatabase[8] = new Employee("Syvorov", "Ivan", "Vasilievich", 3, 39010);
        employeeDatabase[9] = new Employee("Bashin", "Ivan", "Vasilievich", 2, 46000);

        System.out.println(Arrays.toString(employeeDatabase));


        isSummSalary();
        calculatinMinSalary(employeeDatabase);
        calculatinMaxSalary(employeeDatabase);
        double averageSalary=isAverageValueSalaries(employeeDatabase);
        System.out.println("Среднее значение зарплат =   "+averageSalary);
        showNamesAllEmployees(employeeDatabase);
        //indexingSalary(employeeDatabase);


    }
        public static void isSummSalary(){
            double total=0;
            for (Employee employee : employeeDatabase) {
                total += employee.getSalary();
            }
            System.out.println("Cумма затрат на зарплаты в месяц = "+ total);


        }
        public static void calculatinMinSalary(Employee [] arr){
        Employee employeeWithMinSalary=arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i].getSalary()<employeeWithMinSalary.getSalary()){
                employeeWithMinSalary=arr[i];
            }
            } System.out.println("Сотрудник с минимальной зарплатой = " + employeeWithMinSalary.getSurname()+" " +employeeWithMinSalary.getName()+ "  "
            +employeeWithMinSalary.getPatronymic()+ "  "+employeeWithMinSalary.getSalary());


        }
        public static void calculatinMaxSalary(Employee[] arr){
            Employee employeeWithMaxSalary=arr[0];
            for (int i=0; i<arr.length; i++){
                if ( arr[i].getSalary()>employeeWithMaxSalary.getSalary()){
                    employeeWithMaxSalary=arr[i];
                }
            } System.out.println("Сотрудник с максимальной зарплатой = " + employeeWithMaxSalary.getSurname()+" " +employeeWithMaxSalary.getName()+ "  "
                    +employeeWithMaxSalary.getPatronymic()+ "  "+employeeWithMaxSalary.getSalary());
        }



        public static double isAverageValueSalaries(Employee [] arr){
            double total=0;
            for (int i=0; i<arr.length;i++){
                total+=arr[i].getSalary();
            }
            return total/ arr.length;

        }
        public static void showNamesAllEmployees(Employee[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Ф.И.О сотрудника : "+ arr[i].getSurname() +" "+ arr[i].getName()+" " + arr[i].getPatronymic());
            }
        }
      /* static public void indexingSalary(Employee[] arr){
        double indexingArgument=0.1;
        double total=0;
            for (int i = 0; i < arr.length; i++){
                total=indexingArgument*arr[i].getSalary()+arr[i].getSalary();

                System.out.println("Индексация зарплаты на 10% = "+total);
            }
        }*/

        }











