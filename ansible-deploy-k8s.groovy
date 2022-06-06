#!/usr/bin/env groovy

def call(String dockerImage) {
    sh """
        ansible-playbook deploy_k8s.yml -e ansible_python_interpreter=/home/jenkins/workspace/ansible_venv/bin/python --extra-vars \"image_id=${dockerImage}"
    """
}
