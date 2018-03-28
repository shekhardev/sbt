package concurrentHashMap;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> mapWordCount = new ConcurrentHashMap<>();

        List<String> wordList = getWordList();
        for (String word:wordList){
            mapWordCount.compute(word,(k,v)->v==null?1:v+1);
        }
        System.out.println(mapWordCount);
    }
    private static List<String> getWordList(){
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add("AA");
        list.add("BB");
        list.add("AA");
        list.add("CC");
        list.add("DD");
        list.add("DD");
        list.add("AA");
        list.add("CC");
        return list;
    }
}
