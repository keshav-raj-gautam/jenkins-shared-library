def call(){
  echo "Pushing Docker image to DockerHub"
                withCredentials([usernamePassword(credentialsId: "dockerhubcred", usernameVariable: "DOCKERHUB_USER", passwordVariable: "DOCKERHUB_PASS")]) {
                    sh '''
                        echo "$DOCKERHUB_PASS" | sudo docker login -u "$DOCKERHUB_USER" --password-stdin
                        sudo docker tag notes-app:latest $DOCKERHUB_USER/notes-app:latest
                        sudo docker push $DOCKERHUB_USER/notes-app:latest
                    '''
                }
