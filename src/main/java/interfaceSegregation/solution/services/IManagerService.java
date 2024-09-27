package interfaceSegregation.solution.services;

public interface IManagerService {
    void createTask(String task);

    void assignTask(String task);

    void completeTask(String task);
}
