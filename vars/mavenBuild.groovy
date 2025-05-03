# Paste the code and save (Ctrl+O, Ctrl+X)
def call(String mvnGoals = 'clean install') {
    stage('Maven Build') {
        sh "mvn ${mvnGoals}"
    }
}

