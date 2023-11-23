public class Employee {

    private String name;
    private String department;
    private boolean isPayedPerHour;
    private int age;

    public Employee(String name, String department, boolean isPayedPerHour, int age) {
        this.name = name;
        this.department = department;
        this.isPayedPerHour = isPayedPerHour;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isPayedPerHour() {
        return isPayedPerHour;
    }

    public void setPayedPerHour(boolean isPayedPerHour) {
        this.isPayedPerHour = isPayedPerHour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", isPayedPerHour=" + isPayedPerHour +
                ", age=" + age +
                '}';
    }
}

