package medium1.task;

public class ImageTask extends AbstractTask {


    public ImageTask(String taskName) {
        super("linkToImage");
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем картинку. Ссылка на картинку " + getTaskName());
    }
}
