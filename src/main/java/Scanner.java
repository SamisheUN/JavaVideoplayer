import java.io.File;
import java.util.ArrayList;

public class Scanner {
    ArrayList<String> fileList = new ArrayList<>();

    public ArrayList<String> scannerFromDirectory(String directory) {
        File dir = new File(directory);
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileList.add(file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    fileList.addAll(scannerFromDirectory(file.getAbsolutePath()));
                }
            }
        }
        return fileList;
    }

    public ArrayList<String> scannerFromTxt(String fileDirectory) {
        File txtFile = new File(fileDirectory);
        if (txtFile.exists() && txtFile.isFile()) {
            fileList = parseTxt(fileDirectory);
        } else {
            System.out.println("Файл не найден или не является текстовым файлом.");
        }

        return fileList;
    }

    private  void parseTxt(String TxtPath) {

    }
}
