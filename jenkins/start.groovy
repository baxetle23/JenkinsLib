@Library ('JenkinsLib')_

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