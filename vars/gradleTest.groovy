/**
 * Run unit tests in Gradle project.
 */
def call() {
    sh 'chmod +x gradlew'
    sh './gradlew test' // Fokus mengeksekusi automation testing proyek
}