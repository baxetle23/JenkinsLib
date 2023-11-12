pipeline {
    agent {label 'worker'}
    stages{
        stage("test") {
            steps {
                sh "echo Hello world"
                sh ("ls -la")
            }
        }
    }
}