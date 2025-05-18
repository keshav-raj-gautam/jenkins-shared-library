def call(){
  echo "Building the Docker image"
                sh "sudo docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
                echo "Docker image built"
}
