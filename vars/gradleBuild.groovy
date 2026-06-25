/**
 * Build Gradle project.
 */
def call() {
    sh 'chmod +x gradlew' // Mengamankan hak eksekusi script di Linux agen
    sh './gradlew build -x test' // Membangun aplikasi tanpa menjalankan tes di fase ini
}
