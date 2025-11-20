def call(string giturl, string branch) {
  echo "Cloning the code"
  git url: ${giturl}, branch: ${branch}
  echo "Cloning successfull"
}
