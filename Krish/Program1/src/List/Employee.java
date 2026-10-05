package List;

public class Employee {
    int employeeId,employeeAge;
    String employeeName;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public Employee(int employeeId, int employeeAge, String employeeName) {
        this.employeeId = employeeId;
        this.employeeAge = employeeAge;
        this.employeeName = employeeName;
    }
}
