import java.util.HashMap;

/**
 * Created by MikesComputer on 7/06/2017.
 *
 * logItem is an class using a HashMap to store the data for a single logItem.
 */
public class logItem {
    private static HashMap<String, String> logItemData = new HashMap<>();

    public static void AddData(String ID,String game, String title, String startTime, String endTime, String comment, String rating){
        logItemData.put("ID", ID);
        logItemData.put("GAME", game);
        logItemData.put("TITLE", title);
        logItemData.put("TIME_START", startTime);
        logItemData.put("TIME_END", endTime);
        logItemData.put("COMMENT",  comment);
        logItemData.put("RATING", rating);
    }

    public static void setID(String ID){
        logItemData.remove("ID");
        logItemData.put("ID", ID);
    }
    public static void setGame(String game){
        logItemData.remove("GAME");
        logItemData.put("GAME", game);
    }
    public static void setTitle(String title){
        logItemData.remove("TITLE");
        logItemData.put("TITLE", title);
    }
    public static void setStartTime(String startTime){
        logItemData.remove("TIME_START");
        logItemData.put("TIME_START", startTime);
    }
    public static void setEndTime(String endTime){
        logItemData.remove("TIME_END");
        logItemData.put("TIME_END", endTime);
    }
    public static void setComment(String comment){
        logItemData.remove("COMMENT");
        logItemData.put("COMMENT", comment);
    }
    public static void setRating(String rating){
        logItemData.remove("RATING");
        logItemData.put("RATING", rating);
    }

    public static String getID(){return logItemData.get("ID");}
    public static String getGame(){return logItemData.get("GAME");}
    public static String getTitle(){return logItemData.get("TITLE");}
    public static String getStartTime(){return logItemData.get("TIME_START");}
    public static String getEndTime(){return logItemData.get("TIME_END");}
    public static String getComment(){return  logItemData.get("COMMENT");}
    public static String getRating(){return logItemData.get("RATING");}
}
