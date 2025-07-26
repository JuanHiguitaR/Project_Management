public class Task {
    // Attributes
    private String description;
    private String status;
    private Project project;  //Reference to the project to which it belongs.


    // Constructor
    public Task(String description, String status, Project project) {
        this.description = description;
        this.status = status;
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project){
        this.project = project;
    }

    public void setStatus(String newStatus){
        this.status = newStatus;
    }

}
