pipeline {
    agent any

    stages {
        stage('Build') {
            steps {

                bat '''
                set PATH=C:/Program Files/Java/jdk1.8.0_45/bin
                cd C:\Program Files (x86)\Jenkins\workspace\Hello\src
                javac com/unknown/test/Hello.java
                java com/unknown/test/Hello
                '''

                bat 'dir'
            }
        }
    }
}