def cal(String appName , String imageTag , String dockerHubUser) {
    sh """
        docker rmi ${dockerHubUser}/${appName}:${imagetag}
        docker rmi ${dockerHubUser}/${appName} ${dockerHubUser}/${appName}:latest
    """
}