package com.xc.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/2/19.
 */
public class EightiesKids2 {
    public static String findSpaceship(String map) {
        String[] arr = map.split("\n");
        List<String> chart = Arrays.asList(arr);
        for (int i = 0; i < chart.size(); i++) {
            System.out.println(chart.get(i));
            if (chart.get(chart.size() - 1 - i).contains("X")) {
                return "[" + chart.get(chart.size() - i - 1).indexOf("X") + ", " + i + "]";
            }
        }
        return "Spaceship lost forever.";
    }


    public static String findSpaceship1(String map) {
        String[] splittedMap = map.split("\n");
        for(int i = 0; i < splittedMap.length; i++){
            if(splittedMap[i].indexOf("X") != -1) return "[" + splittedMap[i].indexOf("X") + ", " + (splittedMap.length - 1 - i) + "]";
        }
        return "Spaceship lost forever.";
    }

    public static String findSpaceship2(String map) {
        ArrayList<String> spaceMap = new ArrayList<String>(Arrays.asList( map.split("\n")));
        // A more Java stream implementation
        String row = spaceMap.stream()
                .filter(s -> s.contains("X"))
                .findFirst()
                .orElse(null);
        if (row != null) {
            return "[" + row.indexOf("X") + ", " + (spaceMap.size() - spaceMap.indexOf(row) - 1) + "]";
        }
        return "Spaceship lost forever.";
    }

    public static String findSpaceship3(String map) {
        int l = 0, c = 0;
        boolean found = false;
        for (int i = 0; i < map.length() && !found; i++) {
            char x = map.charAt(i);
            if (x == 'X') {
                found = true;
            } else if (x == '\n') {
                l++;
                c = -1;
            }
            if (!found) {
                c++;
            }
        }
        return found ? "[" + c + ", " + (map.split("\n").length - l - 1) + "]" : "Spaceship lost forever.";
    }

    public static String findSpaceship4(String map) {
        int rows = map.replaceAll("[.X]", "").length() + 1;
        boolean found = false;
        char current;
        int x = 1, y = 1;
        for (int i = 0; i < map.length(); i++) {
            current = map.charAt(i);
            if (current == 'X') {
                found = true;
                break;
            } else if (current == '\n') {
                y++;
                x = 1;
            } else {
                x++;
            }
        }
        if (found) {
            return "[" + (x - 1) + ", " + (rows - y) + "]";
        } else {
            return "Spaceship lost forever.";
        }
    }

}
