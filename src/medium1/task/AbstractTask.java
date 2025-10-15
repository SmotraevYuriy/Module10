package medium1.task;

public abstract class AbstractTask implements Task {
    private boolean finished;
    private String taskName;

    public AbstractTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public abstract void showTask();

    @Override
    public void executed() {
        finished = true;
    }

    @Override
    public boolean isFinished() {
        return finished;
    }

    public String getTaskName() {
        return taskName;
    }
}
