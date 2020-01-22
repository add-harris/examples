,export CLICOLOR=1

alias loadrc="source ~/.bashrc"
alias cd..="cd ..;ls"
alias ll="ls -la"
alias dc="docker container"
alias dcls="docker container ls"
alias kb="kubectl"
alias kbgp="kubectl get pods"
alias kbdp="kubectl describe pods"

#export REPO=/Users/adam.harrison/Documents/repository

export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.2.jdk/Contents/Home
export PATH=$HOME/brew/bin:$HOME/bin:$HOME/Library/Python/2.7/bin:$HOME/node_modules/bin:$PATH

export NODE_EXTRA_CA_CERTS=/etc/ssl/certs/zscaler.pem

export CACERTS=$JAVA_HOME/lib/security/cacerts
