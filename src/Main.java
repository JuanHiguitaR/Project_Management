//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Project urbaMorelos = new Project("Morelos Condo",
                    "Residential Project", 5);

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



            urbaMorelos.addTask(machineRent);
            urbaMorelos.addTask(hireStaff);
            urbaMorelos.addTask(morelosPlans);
            urbaMorelos.addTask(buyLot);
            urbaMorelos.addTask(completedHomes);


            urbaMorelos.showTasks();

            urbaMorelos.doneTask(morelosPlans);

            urbaMorelos.showTasks();

            urbaMorelos.addTask(completedHomes);

            System.out.println(machineRent.getProject());

        }
    }
