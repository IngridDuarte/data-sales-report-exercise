import service.ProcessFile;

public class Main {

    public static void main(String... args) {
        ProcessFile processFile = new ProcessFile();
        processFile.generateReportData();
        processFile.contentReader();
    }
}
