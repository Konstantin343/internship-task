package javaTask;

public class RiderIde {
    public Project openProject(String projectPath) {
        return new Project(projectPath);
    }

    private boolean isOpened = true;

    public void close() { 
        isOpened = false; 
    }
    
    public boolean isOpened() {
        return isOpened;
    }
    
    public static RiderIde startRider() {
        return new RiderIde();
    }
}