import java.util.HashMap;

/**
 * Created by MikesComputer on 7/06/2017.
 */
public class output {
    public static void displayAllLogData(HashMap<Integer, logItem> logData){
        System.out.println("----- " + application.csvFileController.getCsvEntries() + " Entries. -----");
        for(int item = 0; item < logData.keySet().toArray().length; item++){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("| ");
            stringBuilder.append(String.format("%-3s", application.logData.get(item).getID()));
            stringBuilder.append(" || ");
            stringBuilder.append(String.format("%-32s", application.logData.get(item).getGame()));
            stringBuilder.append(" || ");
            stringBuilder.append(String.format("%-50s", application.logData.get(item).getTitle()));
            stringBuilder.append(" || ");
            stringBuilder.append(String.format("%-5s", application.logData.get(item).getStartTime()));
            stringBuilder.append(" || ");
            stringBuilder.append(String.format("%-5s", application.logData.get(item).getEndTime()));
            stringBuilder.append(" || ");
            stringBuilder.append(String.format("%-50s", application.logData.get(item).getComment()));
            stringBuilder.append(" || ");
            stringBuilder.append(String.format("%-3s", application.logData.get(item).getRating()));
            stringBuilder.append(" |");
            System.out.println(stringBuilder.toString());
        }
    }
}
