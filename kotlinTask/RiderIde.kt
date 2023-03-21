package kotlinTask

fun startRider() = RiderIde()

class RiderIde {
    fun openProject(projectPath: String) = Project(projectPath)

    private var isOpened = true

    fun close() {
        isOpened = false
    }

    fun isOpened() = isOpened
}