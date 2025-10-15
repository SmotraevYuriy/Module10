package medium1.task;

public class TextTask extends AbstractTask {
    //private String text;


    public TextTask(String taskName) {
        super(taskName);
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем текст " + getTaskName());
    }

}
