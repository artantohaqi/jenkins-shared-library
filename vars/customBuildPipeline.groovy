def call(Map config = [:]) {
    pipeline {
        agent any
        tools { jdk 'jdk17' } // Memaksa standarisasi Java 17 global
        stages {
            stage('Compile & Build via Shared Lib') {
                steps {
                    sh 'chmod +x gradlew' // Mengatasi Permission Denied di agen Linux
                    sh './gradlew compileJava'
                }
            }
            stage('Testing via Shared Lib') {
                steps { sh './gradlew test' }
            }
        }
    }
}