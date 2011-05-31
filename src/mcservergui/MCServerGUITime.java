/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mcservergui;

/**
 *
 * @author dumptruckman
 */
public class MCServerGUITime {

    public static String hmsFromSeconds(int second) {
        int minute = second / 60;
        second = second % 60;
        int hour = minute / 60;
        minute = minute % 60;
        String time = "";
        if (hour != 0) {
            time += hour + "h ";
        }
        if (minute != 0) {
            time += minute + "m ";
        }
        if (second!= 0) {
            time += second + "s";
        }
        return time;
    }

    public static String hoursMinutesSecondsFromSeconds(int second) {
        int minute = second / 60;
        second = second % 60;
        int hour = minute / 60;
        minute = minute % 60;
        String time = "";
        if (hour != 0) {
            time += hour;
        }
        if (hour == 1) {
            time += " hour ";
        } else if (hour > 1) {
            time += " hours ";
        }
        if (minute != 0) {
            time += minute;
        }
        if (minute == 1) {
            time += " minute ";
        } else if (minute > 1) {
            time += " minutes ";
        }
        if (second!= 0) {
            time += second;
        }
        if (second == 1) {
            time += " second";
        } else if (second > 1) {
            time += " seconds";
        }
        return time;
    }

    public static int secondsFromHms(String hms) {
        int seconds = 0, minutes = 0, hours = 0;
        if (hms.contains("h")) {
            hours = Integer.parseInt(hms.split("h")[0].replaceAll(" ", ""));
            if (hms.contains("m") || hms.contains("s")) {
                hms = hms.split("h")[1];
            }
        }
        if (hms.contains("m")) {
            minutes = Integer.parseInt(hms.split("m")[0].replaceAll(" ", ""));
            if (hms.contains("s")) {
                hms = hms.split("m")[1];
            }
        }
        if (hms.contains("s")) {
            seconds = Integer.parseInt(hms.split("s")[0].replaceAll(" ", ""));
        }
        return (hours * 3600) + (minutes * 60) + seconds;
    }
}
