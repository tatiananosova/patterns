package my.patterns.lifecycle;

import java.util.List;

public class LifecycleManager {
    private List<Task> stage0;
    private List<Task> stage1;
    private List<Task> stage2;

    private void executeTasks(List<Task> tasks) {
        for (Task task : tasks) {
            task.execute();
        }
    }

    public void runLifecycle() {
        executeTasks(stage0);
        executeTasks(stage1);
        executeTasks(stage2);
    }

    public void setStage0(List<Task> stage0) {
        this.stage0 = stage0;
    }

    public void setStage1(List<Task> stage1) {
        this.stage1 = stage1;
    }

    public void setStage2(List<Task> stage2) {
        this.stage2 = stage2;
    }
}
