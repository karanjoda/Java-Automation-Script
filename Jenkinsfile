pipeline {
    agent any

    environment {
        PWDD = sh(script: 'pwd', returnStdout: true).trim()
        SONAR_PROJECT_KEY = 'firewall_analyser'
        SONAR_HOST_URL = 'http://172.31.11.103:9000'
        SONAR_TOKEN = 'sqp_67c88b50b568e4c114927070d6a82c155c5cb62d'
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
