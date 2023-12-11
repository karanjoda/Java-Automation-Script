pipeline {
    agent any

    environment {
        PWDD = sh(script: 'pwd', returnStdout: true).trim()
        SONAR_PROJECT_KEY = 'cloud'
        SONAR_HOST_URL = 'http://172.31.11.103:9000'
        SONAR_TOKEN = 'sqp_20c80fd1cda6355573b8ec4647ec10db35ae11d8'
    }

    stages {
        stage('Print Working Directory and List Contents') {
            steps {
                script {
                    // Print the current working directory
                    echo "Current working directory: ${PWDD}"

                    // List the contents of the directory
                    sh 'ls -la'
                }
            }
        }

        stage('Sonar Analysis') {
            steps {
                script {
                    // Running the scanner using Docker
                    sh "docker run \
                        --rm \
                        -e SONAR_HOST_URL=${SONAR_HOST_URL} \
                        -e SONAR_SCANNER_OPTS='-Dsonar.projectKey=${SONAR_PROJECT_KEY}' \
                        -e SONAR_TOKEN=${SONAR_TOKEN} \
                        -v '${PWDD}:/usr/src' \
                        sonarsource/sonar-scanner-cli -X"
                }
            }
        }
    }
}
