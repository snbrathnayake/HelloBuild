pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'cd src'
                bat 'dir'
                 bat '''
                                echo 'Multiline'
                                echo 'Example'
                             '''
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}