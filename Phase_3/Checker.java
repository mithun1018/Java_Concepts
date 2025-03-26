package Phase_3;

import java.util.Comparator;

public class Checker implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getName().compareTo(o2.getName())==0){
            return Integer.compare(o1.getSalary(),o2.getSalary());
        }
        else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
