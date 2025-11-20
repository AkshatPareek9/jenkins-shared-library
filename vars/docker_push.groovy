def call(String imagename, String imageversion) {
    echo "Pushing the image to DockerHub"
    withCredentials([usernamePassword(
        'credentialsId': "dockerhubcred", 
        'passwordVariable': "dockerhubpass", 
        'usernameVariable': "dockerhubuser"
    )]){
        sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
        sh "docker image tag ${imagename}:${imageversion} ${dockerhubuser}/${imagename}:${imageversion}"
        sh "docker push ${dockerhubuser}/${imagename}:${imageversion}"    
    }
}
