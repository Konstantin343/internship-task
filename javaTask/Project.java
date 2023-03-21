package javaTask;

public class Project {
    public String projectPath;

    public Project(String projectPath) {

        this.projectPath = projectPath;
    }

    public Editor openEditor(String filePath) {
        return new Editor(filePath);
    }

    private boolean isOpened = true;

    public void close() {
        isOpened = false;
    }

    public boolean isOpened() {
        return isOpened;
    }
}