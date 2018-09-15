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
                        cd C:/Program Files (x86)/Jenkins/workspace

                        copy junit-4.12.jar Hello/src
                        copy hamcrest-core-1.3.jar Hello/src

                        cd Hello/src

                        javac -cp junit-4.12.jar com/edesk/test/Person.java com/edesk/test/PersonTest.java

                        java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore com.edesk.test.PersonTest

                        '''
                    }
                }
    }
}