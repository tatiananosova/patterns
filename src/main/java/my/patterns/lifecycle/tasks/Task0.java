package my.patterns.lifecycle.tasks;

import my.patterns.lifecycle.Task;

public class Task0 implements Task {
    @Override
    public void execute() {
        System.out.println("запускаем Task0");
    }
}
