/**
 * Created by MichaelRajchert on 7/06/2017.
 */
public class csvFileController {
    private static String filePath = "C:\\Users\\Michael Rajchert\\Documents\\IdeaProjects\\SPL-0_2_1\\src\\SPLdata.csv";
    private static int csvEntries = 0;

    public static void setFilePath(String path){filePath = path;}
    public static void setEntries(int entries){csvEntries = entries;}

    public static String getFilePath(){return filePath;}
    public static int getCsvEntries(){return csvEntries;}
}
