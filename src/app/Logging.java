package app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logging {
    static String folder = ".Logging"; //nama untuk folder
    static String home = System.getProperty("user.home"); //menyimpan 
    static String pathFolder = home + File.separator + folder;

    static String logFile = "Log.txt"; //nama untuk file txt
    static String pathLog = pathFolder + File.separator + logFile;
    
    
    public static String getDateNow() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s z");
        return sdf.format(d);
    }

    public static void logActivity(String activity) {
        try {
            // Membuat folder ".Logging" jika belum ada
            File f = new File(pathFolder);
            if (!f.exists()) {
                f.mkdir();
            }

            // Membuat file "Log.txt" jika belum ada
            File log = new File(pathLog);
            if (!log.exists()) {
                log.createNewFile();
            }

            // Menambahkan entri log dengan timestamp
            String logEntry = "\n[" + getDateNow() + "] " + activity;

            // Menulis ke file log
            Files.write(
                Paths.get(pathLog),
                logEntry.getBytes(),
                StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.out.println("Error Code: 101 => " + e.getMessage());
        }
    }
}
