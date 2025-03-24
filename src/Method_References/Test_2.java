package Method_References;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test_2 {
    public static void main(String[] args) {
//        For No Args Constructor
        Supplier<Employee> employeeSupplier = Employee::new;
        Employee employee = employeeSupplier.get();
        System.out.println(employee);

//        for single Constructor
        Function<Integer, Employee> EmployeeFunction = Employee::new;
        Employee employee1 = EmployeeFunction.apply(1);
        System.out.println(employee1);

//        For Two Args Constructor
        BiFunction<Integer, String, Employee> EmployeeBiFunction = Employee::new;
        Employee employee2 = EmployeeBiFunction.apply(1, "Vijyut");
        System.out.println(employee2);
    }
}
