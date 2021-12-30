package solidLearning.service;

import solidLearning.entity.Employee;

public interface SaveEmployeeService {
    void saveEmployee(Employee employee);

    String getEmployeeCount();
}
