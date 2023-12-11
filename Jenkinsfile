pipeline {
    agent any

    environment {
        SONARSCANNER_HOME = tool 'sonarqube-scanner'
        SONAR_SERVER = 'SonarQube Server'
        SONAR_PROJECT_KEY = 'cloud'
        SONAR_HOST_URL = 'http://172.31.11.103:9000'
        SONAR_TOKEN = 'sqp_20c80fd1cda6355573b8ec4647ec10db35ae11d8'
    }

    stages {
        stage('Sonar Analysis') {
            steps {
                script {
                    withSonarQubeEnv(SONAR_SERVER) {
                        sh "${SONARSCANNER_HOME}/bin/sonar-scanner \
                            -Dsonar.projectKey=${SONAR_PROJECT_KEY} \
                            -Dsonar.host.url=${SONAR_HOST_URL} \
                            -Dsonar.login=${SONAR_TOKEN} \
                            /home/stl/Desktop/cloud/cloud_frontend:/usr/src"
                    }
                }
            }
        }
    }
}
