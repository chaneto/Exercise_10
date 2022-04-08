import java.util.ArrayList;
import java.util.List;

public class EmployeeRecord {

    private Long id;
    private String name;
    private Long managerId;
    private List<EmployeeRecord> employees;

    public EmployeeRecord(Long id, String name, Long managerId) {
        this.id = id;
        this.name = name;
        this.managerId = managerId;
        this.employees = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }


    public List<EmployeeRecord> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeRecord> employees) {
        this.employees = employees;
    }
}
