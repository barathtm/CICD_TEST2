pipeline {
        agent any
        stages {
            stage('Script-001') {
                steps {
                    script {
                            build job: 'Script-001'
                        }
                    }
               }   
            stage('Script-002') {
                steps {
                    script {
                            build job: 'Script-002'
                        }
                    }
               }   
           }
       }