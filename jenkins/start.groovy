timestamps {
  library identifier: "JenkinsLib@main",
  retriever: modernSCM(
    [
      $class: 'GitSCMSource',
      remote: 'https://github.com/baxetle23/JenkinsLib.git',
      credentialsId: 'baxetle23'
    ]
  )
}


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