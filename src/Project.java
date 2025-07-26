public class Project {
    // Attributes
    private String name;
    private String description;
    private Task [] tasks;
    private Integer index;

    // Constructor
    public Project(String name, String description, int tasksNumber) {
        this.name = name;
        this.description = description;
        this.tasks = new Task[tasksNumber];
        this.index = 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Method to add new task
    public void addTask(Task task){
        if(index < this.tasks.length) {
            this.tasks[index] = task;
            task.setProject(this);  // Establish the inverse relationship
            this.index++;
        }else{
            System.out.println("❌ Invalid index!");
        }
    }

    // Method to change status task
    public void doneTask(Task task){
        if(this.tasks != null){
            for (Task value : this.tasks) {
                if (value.equals(task)) {
                    value.setStatus("Done Task! 📝");
                    System.out.println("✅ Changed status successful!");
                    break;
                }
            }
        }else{
            System.out.println("❌ Tasks is Empty!");
        }
    }

    // show info method
    public void showTasks(){
        for (Task value : this.tasks) {
            System.out.printf("Project name: %s Description Tasks: %s Status Task: %s%n",
                    getName(), value.getDescription(), value.getStatus());
        }


    }
}
