import java.util.List;

public class main {

    public static void main(String[] args) {

          EmployeeRecord root = new EmployeeRecord(1L, "Pencho", null);
          EmployeeRecord employee1 = new EmployeeRecord(2L, "Gosho", 1L);
          EmployeeRecord employee2 = new EmployeeRecord(3L, "Ivan", 4L);
          EmployeeRecord employee3 = new EmployeeRecord(4L, "Dragan", 1L);
          EmployeeRecord employee4 = new EmployeeRecord(5L, "Slavi", 2L);
          EmployeeRecord employee5 = new EmployeeRecord(6L, "Miro", 3L);
          EmployeeRecord employee6 = new EmployeeRecord(7L, "Dobri", 2L);
          EmployeeRecord employee7 = new EmployeeRecord(8L, "Petko", 3L);

          List<EmployeeRecord> employeeRecordList = List.of(root, employee1, employee2,
                  employee3, employee4, employee5, employee6, employee7);
          BuildHierarchyTree buildHierarchyTree = new BuildHierarchyTree();
          buildHierarchyTree.readAllEmployees(employeeRecordList);
          buildHierarchyTree.buildTree(buildHierarchyTree.getRoot());
          buildHierarchyTree.print(buildHierarchyTree.getRoot(), 0);
    }
}