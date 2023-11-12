pipeline {
    agent {label 'worker'}
    stages{
        stage("test") {
            steps {
                helloWorld()
            }
        }
    }
}