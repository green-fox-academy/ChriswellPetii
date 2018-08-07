import java.util.ArrayList;
import java.util.Arrays;

public class TodoPrint {
    public static void main(String... args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        String DG = " - Dowonload games";
        String DGD = " - Diablo";
        String[] todoTextArray;
        String newTodoText = "";

        todoTextArray = todoText.split("\n");

        ArrayList<String> todoTextArrayList = new ArrayList<String>(Arrays.asList(todoTextArray));
        todoTextArrayList.add(1, "\n" + DG );
        todoTextArrayList.add(2,"\n" + "\t" + DGD);

        for(String s : todoTextArrayList) {
            newTodoText += s + " ";
        }

        //System.out.print(todoTextArrayList);
        //System.out.println("newtodolist: " + newTodoText);

        System.out.println("My Todo List:\n" + newTodoText);
    }
}