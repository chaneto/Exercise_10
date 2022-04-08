import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildHierarchyTree {

    private Map<Long, EmployeeRecord> employees = new HashMap<>();
    private EmployeeRecord root;

    public BuildHierarchyTree() {
    }

    public Map<Long, EmployeeRecord> getEmployees() {
        return employees;
    }

    public EmployeeRecord getRoot() {
        return root;
    }

    public void readAllEmployees(List<EmployeeRecord> employeeRecordList)  {
        EmployeeRecord employee = null;
        for (EmployeeRecord item : employeeRecordList) {
            employee = new EmployeeRecord(item.getId(), item.getName(), item.getManagerId());
            employees.put(employee.getId(), employee);
            if (employee.getManagerId() == null)
                root = employee;
        }
    }

    private List<EmployeeRecord> getEmployeesById(Long managerId) {
        List<EmployeeRecord> result = new ArrayList<>();
        for (EmployeeRecord employee : employees.values()) {
            if (employee.getManagerId() == managerId)
                result.add(employee);
        }
        return result;
    }

    public void buildTree(EmployeeRecord root) {
        EmployeeRecord employee = root;
        List<EmployeeRecord> employeesRecord = getEmployeesById(employee.getId());
        employee.setEmployees(employeesRecord);
        if (employeesRecord.size() == 0)
            return;
        for (EmployeeRecord item : employeesRecord)
            buildTree(item);
    }

    public void print(EmployeeRecord root, int level) {
        for (int i = 0; i < level; i++)
            System.out.print("\t");
        System.out.println(root.getName());
        List<EmployeeRecord> employees = root.getEmployees();
        for (EmployeeRecord item : employees)
            print(item, level+1);
    }
}
