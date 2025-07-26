//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            //Building a project
            Project urbaMorelos = new Project("Morelos Condo",
                    "Residential Project", 5);
            // Creating Tasks
            Task morelosPlans = new Task("Make Plans",
                    "Initialized", urbaMorelos);

            Task machineRent = new Task("Rent Machinery",
                    "Planing", urbaMorelos);

            Task hireStaff = new Task("Looking for administrative and general " +
                    "staff", "Initiated", urbaMorelos);

            Task buyLot = new Task("Negotiating the lot", "Done Task",
                    urbaMorelos);

            Task completedHomes = new Task("Schedule project delivery date",
                    "Planing", urbaMorelos);


            // Add tasks in Project
            urbaMorelos.addTask(machineRent);
            urbaMorelos.addTask(hireStaff);
            urbaMorelos.addTask(morelosPlans);
            urbaMorelos.addTask(buyLot);
            urbaMorelos.addTask(completedHomes);

            // Show info project and tasks
            urbaMorelos.showTasks();
            // Using method doneTask
            urbaMorelos.doneTask(morelosPlans);
            // Show new info after changed
            urbaMorelos.showTasks();
            // Overflowing task array
            urbaMorelos.addTask(completedHomes);
            // Nothing to seeing
            System.out.println(machineRent.getProject());

        }
    }
