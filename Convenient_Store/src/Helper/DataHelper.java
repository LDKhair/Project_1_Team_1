package Helper;

import Model.Staff;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class DataHelper {

//    public static final Image APP_ICON;
//    static {
//        String file = "/Users/leduckhai/Documents/Tai lieu hoc tap/Summer2024/BLOCK 1/Du an mau/EduSys/SOF204_PolyPro/src/ImageProject/fpt.png";
//        APP_ICON = new ImageIcon(ShareHelper.class.getResource(file)).getImage();
//    }
    
//    public static boolean saveLogo(File file) {
//        File dir = new File("logos");
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//        File newFile = new File(dir, file.getName());
//
//        try {
//            Path source = Paths.get(file.getAbsolutePath());
//            Path destination = Paths.get(newFile.getAbsolutePath());
//            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
//            return true;
//        } catch (Exception ex) {
//            return false;
//        }
//    }

    public static ImageIcon readLogo(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

    public static Staff USER = null;

    public static void logoff() {
        DataHelper.USER = null;
    }

    public static boolean authenticated() {
        return DataHelper.USER != null;
    }

    public static void invalidInput(JTextField input) {
        input.setBackground(Color.yellow);
        input.requestFocus();
    }

    public static void validInput(JTextField input) {
        input.setBackground(Color.white);
    }
}
