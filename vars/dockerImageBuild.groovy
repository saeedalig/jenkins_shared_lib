def cal(String appName , String imageTag , String dockerHubUser) {
    sh """
        docker image build -t ${dockerHubUser}/${appName} .
        docker image tag ${dockerHubUser}/${appName} ${dockerHubUser}/${appName}:${imagetag}
        docker image tag ${dockerHubUser}/${appName} ${dockerHubUser}/${appName}:latest
    """
}