pipeline {
    agent {label 'worker'}
    stages{
        stage("test") {
            steps {
                sh ("ls -la")
            }
        }
    }
}