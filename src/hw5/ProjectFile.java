package hw5;

/**
 * Файл проекта
 */
public class ProjectFile {

    private final String fileName;
    private final int setting1;
    private final String setting2;
    private final boolean setting3;

    public ProjectFile(String fileName) {
        this.fileName = fileName;

        setting1 = 1;
        setting2 = "...";
        setting3 = false;
    }

    public String getFileName() {return fileName;}

    public int getSetting1() {return setting1;}

    public String getSetting2() {return setting2;}

    public boolean isSetting3() {return setting3;}
}
