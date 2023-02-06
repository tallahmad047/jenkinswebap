pipeline {
    agent any

    stages {
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
