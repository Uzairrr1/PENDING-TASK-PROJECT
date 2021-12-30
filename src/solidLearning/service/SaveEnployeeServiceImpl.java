package solidLearning.service;

import solidLearning.entity.Employee;

import java.util.HashMap;
import java.util.Map;

public class SaveEnployeeServiceImpl implements SaveEmployeeService{

    Map<Integer,Employee> employeeMap = new HashMap<>();
    @Override
    public void saveEmployee(Employee employee) {
        employeeMap.put(employee.getId(),employee);

    }

    @Override
    public String getEmployeeCount() {
        return null;
    }


}
