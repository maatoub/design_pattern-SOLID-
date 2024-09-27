package interfaceSegregation.problem;

import interfaceSegregation.problem.services.TaskService;

public class Manager implements TaskService {

    @Override
    public void createTask(String task) {
        System.out.println("Task created " + task);
    }

    @Override
    public void assignTask(String task) {
        System.out.println("Task assigned " + task);
    }

    @Override
    public void completeTask(String task) {
        System.out.println("Task completed " + task);
    }

}
