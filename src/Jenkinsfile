pipeline {
    agent any

    environment {
        THREADS = '2'
        ENV = 'QA'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/shivanisaurabh/NewProject'
            }
        }

        stage('Build') {
            steps {
                echo "Build started..."
                bat 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                echo "Running tests..."
                bat 'mvn test'
            }
        }

        stage('Publish Report') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            echo 'Cleaning up...'
        }
        failure {
            echo 'Build failed!'
        }
    }
}