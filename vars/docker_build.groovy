def call(String imagename, String imageversion){
    echo "Building the code"
    sh "docker build -t ${imagename}:${imageversion} ."
}
