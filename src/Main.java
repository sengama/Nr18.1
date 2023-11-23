import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String [] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ionescu Ion", "Management", true, 30),
                new Employee("Popescu Maria", "IT", false, 22),
                new Employee("Vasilescu Vasile", "Management", false, 35),
                new Employee("Georgescu George", "Marketing", true, 27),
                new Employee("Dinu Dana", "Management", true, 29)
        );


        employees.stream()
        .filter(employee -> employee.getAge() > 25)
                .filter(employee -> employee.isPayedPerHour())
                .filter(employee -> employee.getDepartment().equals("Management"))
                .distinct()
                .limit(5)
                .forEach(System.out::println);
    }
}
