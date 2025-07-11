pipeline {
    agent any

    tools {
        maven 'Maven_3.9.10' // Make sure this matches your configured Maven name in Jenkins
        jdk 'JDK_17'         // Also configure this JDK name in Jenkins tools
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/shivanisaurabh/NewProject.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Publish Report') {
            steps {
                publishHTML(target: [
                    reportDir: 'test-output',
                    reportFiles: 'ExtentReport.html',
                    reportName: 'Extent Report',
                    alwaysLinkToLastBuild: true,
                    keepAll: true
                ])
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }

}