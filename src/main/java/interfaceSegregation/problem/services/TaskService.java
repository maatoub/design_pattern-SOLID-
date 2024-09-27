package interfaceSegregation.problem.services;

public interface TaskService {
    void createTask(String task);

    void assignTask(String task);

    void completeTask(String task);
}
