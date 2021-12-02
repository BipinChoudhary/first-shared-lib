node {
    properties([parameters([choice(choices: ['dev', 'uat', 'prod'], description: 'env', name: 'Env'), string(defaultValue: 'Please enter your db', name: 'database'), string(defaultValue: 'Please enter your script file name', name: 'SQL Scripts File')])])
    stage('Preparation') { // for display purposes
        
    }
    stage('Build') {
        echo "new upodate"
        
    }
    stage('Results') {
       
    }
}
