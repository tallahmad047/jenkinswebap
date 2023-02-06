pipeline {
    agent any
    tools{
           maven '3.8.6'
       }

    stages {
        stage("source"){
              steps{
                 git branch: 'master' ,url:'https://github.com/tallahmad047/jenkinswebap.git'
            }
        stage('Build') {
            steps {
                // Build steps for your application
                bat 'mvn clean'
                bat 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                ansiblePlaybook colorized: true, playbook: 'deploy.yml'
            }
        }
    }
}
