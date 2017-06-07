import java.util.HashMap;
import java.util.Scanner;

/**
 * SPL, The Shadow Play Logger
 * Created by MikesComputer on 7/06/2017.
 */
public class application {
    public static HashMap<Integer, logItem> logData = new HashMap<>();
    private static logReader logReader = new logReader();
    public static csvFileController csvFileController = new csvFileController();
    private static output output = new output();

    public static void main(String[] args){
        System.out.println("SPL - Shadowplay Logger");

        logData = logReader.initialiseData(csvFileController.getFilePath());
        run();
    }
    private static void run(){
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        String UserIn = scanner.next().toLowerCase();
        if(UserIn.compareTo("help") == 0){
            help();
            run();
        } else if(UserIn.compareTo("listdata") == 0){
            listData();
            run();
        } else if(UserIn.compareTo("add") == 0){
            add();
            run();
        } else if(UserIn.compareTo("delete") == 0){
            delete();
            run();
        } else if(UserIn.compareTo("Exit") == 0){
            return;
        }
    }
    private static void help(){
        System.out.println("ListData - Lists existing logs.");
        System.out.println("Add      - Add's new log.");
        System.out.println("Delete   - Remove an item.");
        System.out.println("Exit     - Quits the program");
        System.out.println("Help     - List this menu again.");
    }
    private static void listData(){
        output.displayAllLogData(logData);
    }
    private static void add(){

    }
    private static void delete(){

    }
}
