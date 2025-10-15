package medium1.task;

public class DocumentTask extends AbstractTask {

    public DocumentTask(String taskName) {
        super("documentLink");
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем документ. Ссылка на документ " + getTaskName());
    }

}
