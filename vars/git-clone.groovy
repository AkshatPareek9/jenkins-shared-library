def call(String giturl, String branch) {
  echo "Cloning the code"
  git url: "${giturl}", branch: "${branch}"
  echo "Cloning successfull"
}
