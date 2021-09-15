package model;

import java.util.ArrayList;
import java.util.Random;
public class Dictionary {
    private static ArrayList<String> wordPool = new ArrayList<>();
    public static void setWords(){
        wordPool.add("communication");
        wordPool.add("science");
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