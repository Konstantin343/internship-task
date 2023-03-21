package kotlinTask;

class Editor(val filePath: String) {
    private var textBuilder = StringBuilder()

    private var position: Int = 0

    fun getText() = textBuilder.toString()

    fun leftArrow() {
        position = maxOf(0, position - 1)
    }

    fun rightArrow() {
        position = minOf(position + 1, getText().length)
    }

    fun type(text: String) {
        textBuilder.insert(position, text)
        position += text.length
    }

    fun pressEnter() = type("\n")

    fun pressBackspace() {
        if (position != 0) {
            textBuilder.delete(position - 1, position)
            position--;
        }
    }
    
    private var isOpened = true

    fun close() {
        isOpened = false
    }

    fun isOpened() = isOpened
}