package Phase_3;

import java.util.*;

public class EmployeeManager implements EmployeeManagerInterface {
    private static HashMap<String,Employee> employeeHashMap=new HashMap<>();

    public static HashMap<String, Employee> getEmployeeHashMap() {
        return employeeHashMap;
    }
    public static void action(){
        Scanner scan=new Scanner(System.in);
        EmployeeManager employeeManager=new EmployeeManager();
        while (true) {
            System.out.println("1.Add Employees\n2.RemoveEmployees\n3.Search Employees\n4.Sort Employees\n5.Exit\nEnter Your choice:");
            int managerChoice = Integer.parseInt(scan.next());
            switch (managerChoice){
                case 1:
                    employeeManager.addEmployees();
                    break;
                case 2:
                    employeeManager.removeEmployees();
                    break;
                case 3:
                    employeeManager.searchEmployees();
                    break;
                case 4:
                    employeeManager.sortEmployees();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input...");
            }
        }
    }
    @Override
    public void addEmployees() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the new Employee ID:");
        String employeeID = scan.next();
        if (EmployeeManager.getEmployeeHashMap().containsKey(employeeID)) {
            System.out.println("Employee ID is already Exist...");
        }
        else {
            System.out.println("Enter the new Employee Name:");
            String employeeName = scan.next();
            System.out.println("Enter the new Employee Department:");
            String employeedep = scan.next();
            System.out.println("Enter the new Employee Salary:");
            int employeeSalary = Integer.parseInt(scan.next());
            String salary=String.format("",employeeSalary);
            EmployeeManager.getEmployeeHashMap().put(employeeID, new Employee(employeeID, employeeName, employeeSalary, employeedep));
            System.out.println("SuccessFully New Employee Added...");
        }
    }

    @Override
    public void removeEmployees() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Employee ID to Remove:");
        String idToRemove=scan.next();
        if(EmployeeManager.getEmployeeHashMap().containsKey(idToRemove)){
            EmployeeManager.getEmployeeHashMap().remove(idToRemove);
            System.out.println("SuccessFully Employee Removed...");
        }
        else {
            System.out.println("Employee ID not Found...");
        }
    }

    @Override
    public void searchEmployees() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Employee ID to Search:");
        String idToSearch=scan.next();
        try {
//            if(EmployeeManager.getEmployeeHashMap().containsKey(idToSearch)){
                Employee detail=EmployeeManager.getEmployeeHashMap().get(idToSearch);
                System.out.println("Employee Name: "+detail.getName()+"\nEmployee ID: "+detail.getId()+"\nEmployee Salary: "+ String.format("%,d",detail.getSalary())+"\nEmployee Department: "+detail.getDepartment());
//            }
        } catch (Exception e) {
            System.out.println("No Employee Found...");
        }


    }

    @Override
    public void sortEmployees() {
        ArrayList<Employee> employee=new ArrayList<>();
//         Checker checker=new Checker();

         for(Employee ind:EmployeeManager.getEmployeeHashMap().values()){
             employee.add(ind);
         }
        Collections.sort(employee);
        for(Employee sortEmployee:employee){
            System.out.println("Employee Name: "+ sortEmployee.getName()+"\n    Employee Salary: "+ String.format("%,d",sortEmployee.getSalary()));
        }
    }


}
