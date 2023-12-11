pipeline {
    agent any

    environment {
        PWDD = sh 'pwd'
        SONAR_PROJECT_KEY = 'cloud'
        SONAR_HOST_URL = 'http://172.31.11.103:9000'
        SONAR_TOKEN = 'sqp_20c80fd1cda6355573b8ec4647ec10db35ae11d8'
    }

    stages {
        stage('Print Working Directory and List Contents') {
            steps {
                script {
                    // Print the current working directory
                    sh 'pwd'

                    // List the contents of the directory
                    sh 'ls -la'

                    
                }
            }
        }

        stage('Sonar Analysis') {
            steps {
                script {
                    //RUNNING scanner 
                    sh 'docker run \
    --rm \
    -e SONAR_HOST_URL="http://172.31.11.103:9000" \
    -e SONAR_SCANNER_OPTS="-Dsonar.projectKey=cloud" \
    -e SONAR_TOKEN="sqp_20c80fd1cda6355573b8ec4647ec10db35ae11d8" \
    -v "PWDD:/usr/src" \
    sonarsource/sonar-scanner-cli -X'
                    }
                }
            }
        }
    }
}
