import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by MikesComputer on 7/06/2017.
 *
 * log
 */
public class logReader {
    public static HashMap<Integer, logItem> initialiseData(String path){
        HashMap<Integer, logItem> logData = new HashMap<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                String[] splitLine = line.split(",");
                logData.put(Integer.parseInt(splitLine[0]), new logItem());
                logData.get(Integer.parseInt(splitLine[0])).addData(splitLine[0],splitLine[1],splitLine[2],splitLine[3],splitLine[4],splitLine[5],splitLine[6]);
                application.csvFileController.setEntries(Integer.parseInt(splitLine[0]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logData;
    }
}
