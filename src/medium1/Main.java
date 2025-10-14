package medium1;

import medium1.task.DocumentTask;
import medium1.task.ImageTask;
import medium1.task.Task;
import medium1.task.TextTask;

public class Main {
    public static void main(String[] args) {

        Task documentTask = new DocumentTask("ссылка на документ");
        Task imageTask = new ImageTask("ссылка на изображение");
        Task textTask = new TextTask("Вынести мусор");

        TaskList taskList = new TaskList(new Task[]{imageTask, documentTask, textTask});
        taskList.showUnfinishedTasks();
        textTask.executed();
        taskList.showFinishedTasks();

    }
}
