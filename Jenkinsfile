pipeline {
    agent any

    stages {
        stage('compiled ') {
            steps {
                bat '''
                set PATH=C:/Program Files/Java/jdk1.8.0_45/bin
                cd C:/Program Files (x86)/Jenkins/workspace/Hello/src
                javac com/edesk/test/Hello.java
                java com/edesk/test/Hello
                '''
            }
        }
         stage('test') {
                    steps {
                        bat '''
                        set PATH=C:/Program Files/Java/jdk1.8.0_45/bin
                        cd C:/Program Files (x86)/Jenkins/workspace/Hello/src
                        javac com/edesk/test/TestJunit.java
                        java com/edesk/test/Hello
                        '''
                    }
                }
    }
}