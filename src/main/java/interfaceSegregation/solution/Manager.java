package interfaceSegregation.solution;

import interfaceSegregation.solution.services.IManagerService;

public class Manager implements IManagerService {

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
