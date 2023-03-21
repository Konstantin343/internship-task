package kotlinTask

class Project(val projectPath: String) {
    fun openEditor(filePath: String) = Editor(filePath)

    private var isOpened = true

    fun close() {
        isOpened = false
    }

    fun isOpened() = isOpened
}