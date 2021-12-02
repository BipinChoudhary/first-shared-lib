pipeline {
    agent any
    stages {
        stage ('Example') {
            steps {
                // log.info 'Starting' 
                echo "test"
            }
        }
    }
}
