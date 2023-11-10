def cal(String appName , String imageTag , String dockerHubUser) {
    
    sh """   
     trivy image ${dockerHubUser}/${appName}:latest > scan.txt
     cat scan.txt
    """
}

// Install trivy on server