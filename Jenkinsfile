pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/lppar2/jenkins_pr.git'
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}