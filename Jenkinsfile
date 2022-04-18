pipeline {
             environment{
                 imageName = ""
             }
             agent any
             stages {
                 stage('Git Pull') {
                     steps {
                         git url: 'https://github.com/bharathjoshi/miniCalculator', branch: 'master',
                         credentialsId: 'miniCalculatorCred'
                     }
                 }
                 stage('Maven Build') {
                     steps {
                             sh 'mvn clean install'
                     }
                 }

                 stage('Maven Install') {
                     steps {
                             sh 'mvn install'
                     }
                 }
                 stage('Maven Test') {
                     steps {
                             sh 'mvn test'
                     }
                 }
                 stage('DockerImage') {
                     steps {
                             script {
                                 imageName = docker.build "bharathjoshi/minicalculatorimage:latest"
                         }
                     }
                 }
                 stage('Ansible') {
                     steps {
                         ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml'
                     }
                 }
             }
        }