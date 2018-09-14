public class TodoApp {
    private final TaskOperations taskOperations;

    TodoApp() {
        this.taskOperations = new TaskOperations();
    }

    public void run(String[] args) {
        if (args.length < 1) {
            printHelp();
            return;
        }

        if (args[0].equals("-l")) {
            taskOperations.listAll();
            return;
        }

        if (args[0].equals("-a")) {
            if (args.length < 2) {
                System.out.println("Unable to add: no task provided");
                return;
            }

            taskOperations.addTask(args[1]);
            return;
        }

        if (args[0].equals("-c")) {
            if (args.length < 2) {
                System.out.println("Unable to check: no index provided");
                return;
            }

            try {
                taskOperations.doneTodo(Integer.parseInt(args[1]));
            } catch (NumberFormatException e) {
                System.out.println("Unable to check: index is not a number");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to check: index is out of bound");
            }
            return;
        }

        if (args[0].equals("-r")) {
            if (args.length < 2) {
                System.out.println("Unable to remove: no index provided");
                return;
            }

            try {
                taskOperations.removeTask(Integer.parseInt(args[1]));
            } catch (NumberFormatException e) {
                System.out.println("Unable to remove: index is not a number");
            }
            return;
        }

        if (args[0].equals("-u")) {
            if (args.length < 3) {
                System.out.println("Unable to update: no index provided or no new description added");
                return;
            }

            try {
                taskOperations.updateTask(Integer.parseInt(args[1]), args[2]);
            } catch (NumberFormatException e) {
                System.out.println("Unable to remove: index is not number");
            }
            return;
        }

        System.out.println("Unsupported argument");
    }

    private void printHelp() {
        System.out.println("Command Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                " -l   Lists all the tasks\n" +
                " -a   Adds a new task\n" +
                " -r   Removes an task\n" +
                " -c   Completes an task");
    }
}
