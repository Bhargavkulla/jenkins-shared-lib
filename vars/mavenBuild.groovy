def call(String mvnGoals = 'clean install') {
    stage('Maven Build') {
        sh "mvn ${mvnGoals}"
    }
}

