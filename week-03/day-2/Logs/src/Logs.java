import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.
        Path logPath = Paths.get("log.txt");
        List<String> logPathList = new ArrayList<>();
        List<String> GETList = new ArrayList<>();
        List<String> POSTList = new ArrayList<>();

        try {
            logPathList = Files.readAllLines(logPath);
            String[][] splittedLines = new String[logPathList.size()][10];
            for (int i = 0; i < logPathList.size(); i++) {
                splittedLines[i] = logPathList.get(i).split(" ");
            }
            String[] uniqueIPs = splitter(splittedLines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        getpostRatioCalculator(logPathList, GETList, POSTList);
        System.out.println("GET and POST ratio: " + GETList.size() + " : " + POSTList.size());
    }

    public static String[] splitter(String[][] splittedLines) {
        String uniques = "";
        for (int i = 0; i < splittedLines.length; i++) {
            if (!uniques.contains(splittedLines[i][8])) {
                uniques += (" " + splittedLines[i][8]);
            }
        }
        String[] uniquesArray = new String[splittedLines.length];
        uniquesArray = uniques.split(" ");
        return uniquesArray;
    }

    public static void getpostRatioCalculator(List<String> logPathList, List<String> GETList, List<String> POSTList) {
        for (int i = 0; i < logPathList.size(); i++) {
            //System.out.println(logPathList.get(i).toString());
            if (logPathList.get(i).contains("GET")) {
                GETList.add(logPathList.get(i));
            } else {
                POSTList.add(logPathList.get(i));
            }
        }
    }
}
