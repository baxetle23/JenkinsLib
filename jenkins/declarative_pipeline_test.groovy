timestamps {
  library identifier: "JenkinsLib@main",
  retriever: modernSCM(
    [
      $class: 'GitSCMSource',
      remote: 'https://github.com/baxetle23/JenkinsLib.git',
      credentialsId: 'git_credentials'
    ]
  )
}

pipeline {

    agent {label 'worker'}

    tools { go 'go_1.21.4' }

    stages{
        stage("hello world") {
          steps {
              helloWorld()
          }
        }
        stage("check tools") {
          steps {
            sh 'go version'
          }
        }
        stage("build") {
          steps {
            git branch: '${BRANCH_NAME}',
                credentialsId: 'git_credentials',
                url: '${GIT_URL}'

            sh('git status')

            sh('make build')
          }
        }
        stage("test") {
          steps {
            sh("run test")
          }
        }
        stage("static analize") {
          steps {
            sh("run static analize")
          }
        }
        stage("post") {
          steps {
            sh("ls -la")
            sh("this is end")
          }
        }
    }
}