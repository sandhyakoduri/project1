package model;

import java.util.ArrayList;
import java.util.Random;
public class Words {
    private static ArrayList<String> wordPool = new ArrayList<>();
    public static void setWords(){
        wordPool.add("communication");
        wordPool.add("science");
        wordPool.add("programming");
        wordPool .add("language");
        wordPool.add("difficulty");
        wordPool.add("artificial");
        wordPool.add("intelligence");
        wordPool.add("attempts");
        wordPool.add("screenshot");
        wordPool.add("baseball");
        wordPool.add("windows");
        wordPool.add("learning");
        wordPool.add("electronics");
        wordPool.add("electronics");
        wordPool.add("beautiful");
        wordPool.add("internet");
        wordPool.add("database");
        wordPool.add("organization");
        wordPool.add("application");
        wordPool.add("network");
        wordPool.add("friendly");
        wordPool.add("validation");
        wordPool.add("attempts");
        wordPool.add("statistics");
        wordPool.add("physics");
        wordPool.add("chemistry");
        wordPool.add("engineering");
        wordPool.add("school");
        wordPool.add("industry");
        wordPool.add("revolution");
        wordPool.add("progress");
        wordPool.add("characters");
        wordPool.add("heavily");
        wordPool.add("graphics");
    }


//    {
//        "communication", "science", "programming", "language", "difficulty", "artificial", "intelligence", "attempts", "screenshot", "baseball",
//        "windows", "learning", "electronics", "beautiful", "internet", "database", "organization", "application", "network", "friendly",
//        "validation", "attempts", "statistics", "physics", "chemistry", "engineering", "school", "industry", "revolution", "progress",
//        "characters", "heavily", "graphics" };
    
    public static String getWords() {
        Random random =new Random();
      int i = random.nextInt(33);
      return wordPool.get(i);
    }
  }