package interfaceSegregation.problem;

import interfaceSegregation.problem.services.TaskService;

public class Employee implements TaskService {

    @Override
    public void createTask(String task) {
        // Les employés ne devraient pas pouvoir assigner des tâches
    }

    @Override
    public void assignTask(String task) {
        // Les employés ne peuvent pas supprimer de tâches
    }

    @Override
    public void completeTask(String task) {
        // Les employés peuvent compléter des tâches
        System.out.println("Task completed: " + task);
    }
}
