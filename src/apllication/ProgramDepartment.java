package apllication;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.model.entities.Department;
import java.util.List;
import java.util.Scanner;

public class ProgramDepartment {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("--- TEST 1: department findById ---");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n--- TEST 3: department findAll ---");
        List<Department> listAll = departmentDao.findAll();

        for (Department obj : listAll) {
            System.out.println(obj);
        }

        System.out.println("\n--- TEST 4: department insert ---");
        Department newDepartment = new Department(null, "SudoPop");
        departmentDao.insert(newDepartment);

        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("\n--- TEST 5: department update ---");
        department = departmentDao.findById(1);
        department.setName("Pooop");
        System.out.println(department);
        departmentDao.update(department);
        System.out.println("Update Completed");

        System.out.println("\n--- TEST 6: department delete ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the id to be deleted: ");
        int id = scanner.nextInt();

        departmentDao.deleteById(id);
        System.out.println("Id: " + id + " deleted.");
        scanner.close();
    }

}
