package javaTask;

public class Editor {
    public String filePath;

    public Editor(String filePath) {
        this.filePath = filePath;
    }
    
    private final StringBuilder textBuilder = new StringBuilder();

    private int position = 0;

    public String getText() {
        return textBuilder.toString();
    } 

    public void leftArrow() {
        position = Math.max(0, position - 1);
    }

    public void rightArrow() {
        position = Math.min(position + 1, getText().length());
    }
    
    public void type(String text) {
        textBuilder.insert(position, text);
        position += text.length();
    }
    
    public void pressEnter() {
        type("\n");
    }

    public void pressBackspace() {
        if (position != 0) {
            textBuilder.delete(position - 1, position);
            position--;
        }
    }

    private boolean isOpened = true;

    public void close() {
        isOpened = false;
    }

    public boolean isOpened() {
        return isOpened;
    }
}