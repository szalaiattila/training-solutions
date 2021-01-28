package introconstructors;

public class TaskMain {

    public static void main(String[] args) {
        Task task = new Task("Project", "Project1");

        System.out.println(" Title: " + task.getTitle());
        System.out.println(" Description: " + task.getDescription());

        task.start();
        task.setDuration(60);



        System.out.println(" Kezdés "
                + task.getStartDateTime()
                + " Időtartam"
                + task.getDuration()
                + " Vége ");
    }
}
