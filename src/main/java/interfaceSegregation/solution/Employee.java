package interfaceSegregation.solution;

import interfaceSegregation.solution.services.IEmployeeService;

public class Employee implements IEmployeeService {

    @Override
    public void completeTask(String task) {
        // Les employés peuvent compléter des tâches
        System.out.println("Task completed: " + task);
    }
}
