package medium1.task;

public abstract class AbstractTask implements Task {
    private boolean finished;
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
}
