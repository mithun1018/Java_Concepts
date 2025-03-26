package Phase_3;

public class Employee implements Comparable<Employee>{
    private String id;
    private String name;
    private int salary;
    private String department;
    public Employee(String id,String name,int salary,String department){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Employee o) {
        if(o.getName().compareTo(this.getName())==0){
            return Integer.compare(this.getSalary(),o.getSalary());
        }
        else {
            return this.getName().compareTo(o.getName());
        }
    }
}
