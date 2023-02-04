#!/usr/bin/env  groovy

def call() {
    echo "building the application for branch name $BRANCH_NAME"
    sh 'mvn clean package'
}