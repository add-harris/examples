
# If you come from bash you might have to change your $PATH.
# export PATH=$HOME/bin:/usr/local/bin:$PATH

# Path to your oh-my-zsh installation.
export ZSH="/Users/adam.harrison/.oh-my-zsh"

# Set name of the theme to load --- if set to "random", it will
# load a random theme each time oh-my-zsh is loaded, in which case,
# to know which specific one was loaded, run: echo $RANDOM_THEME
# See https://github.com/robbyrussell/oh-my-zsh/wiki/Themes
ZSH_THEME="robbyrussell"

# Set list of themes to pick from when loading at random
# Setting this variable when ZSH_THEME=random will cause zsh to load
# a theme from this variable instead of looking in ~/.oh-my-zsh/themes/
# If set to an empty array, this variable will have no effect.
# ZSH_THEME_RANDOM_CANDIDATES=( "robbyrussell" "agnoster" )

# Uncomment the following line to use case-sensitive completion.
# CASE_SENSITIVE="true"

# Uncomment the following line to use hyphen-insensitive completion.
# Case-sensitive completion must be off. _ and - will be interchangeable.
# HYPHEN_INSENSITIVE="true"

# Uncomment the following line to disable bi-weekly auto-update checks.
# DISABLE_AUTO_UPDATE="true"

# Uncomment the following line to automatically update without prompting.
# DISABLE_UPDATE_PROMPT="true"

# Uncomment the following line to change how often to auto-update (in days).
# export UPDATE_ZSH_DAYS=13

# Uncomment the following line if pasting URLs and other text is messed up.
# DISABLE_MAGIC_FUNCTIONS=true

# Uncomment the following line to disable colors in ls.
# DISABLE_LS_COLORS="true"

# Uncomment the following line to disable auto-setting terminal title.
# DISABLE_AUTO_TITLE="true"

# Uncomment the following line to enable command auto-correction.
# ENABLE_CORRECTION="true"

# Uncomment the following line to display red dots whilst waiting for completion.
# COMPLETION_WAITING_DOTS="true"

# Uncomment the following line if you want to disable marking untracked files
# under VCS as dirty. This makes repository status check for large repositories
# much, much faster.
# DISABLE_UNTRACKED_FILES_DIRTY="true"

# Uncomment the following line if you want to change the command execution time
# stamp shown in the history command output.
# You can set one of the optional three formats:
# "mm/dd/yyyy"|"dd.mm.yyyy"|"yyyy-mm-dd"
# or set a custom format using the strftime function format specifications,
# see 'man strftime' for details.
# HIST_STAMPS="mm/dd/yyyy"

# Would you like to use another custom folder than $ZSH/custom?
# ZSH_CUSTOM=/path/to/new-custom-folder

# Which plugins would you like to load?
# Standard plugins can be found in ~/.oh-my-zsh/plugins/*
# Custom plugins may be added to ~/.oh-my-zsh/custom/plugins/
# Example format: plugins=(rails git textmate ruby lighthouse)
# Add wisely, as too many plugins slow down shell startup.
plugins=(git kubetail)

source $ZSH/oh-my-zsh.sh

# User configuration

# export MANPATH="/usr/local/man:$MANPATH"

# You may need to manually set your language environment
# export LANG=en_US.UTF-8

# Preferred editor for local and remote sessions
# if [[ -n $SSH_CONNECTION ]]; then
#   export EDITOR='vim'
# else
#   export EDITOR='mvim'
# fi

# Compilation flags
# export ARCHFLAGS="-arch x86_64"

# Set personal aliases, overriding those provided by oh-my-zsh libs,
# plugins, and themes. Aliases can be placed here, though oh-my-zsh
# users are encouraged to define aliases within the ZSH_CUSTOM folder.
# For a full list of active aliases, run `alias`.
#
# Example aliases
# alias zshconfig="mate ~/.zshrc"
# alias ohmyzsh="mate ~/.oh-my-zsh"

alias loadrc="source ~/.zshrc"
alias cd..="cd ..;ls"

# Docker
alias dc="docker container"
alias dcls="docker container ls"

# Kubectl
alias kb="kubectl"
alias kbgp="kubectl get pods"
alias kbd="kubectl describe"
alias kbl="kubectl logs --since=1h"
alias kc="kubectx"
alias kn="kubens"

# AWS
alias aws-exuser="aws-vault exec user"

# LocalStack
alias aws-l="aws --endpoint-url=http://localhost:4572"

# Fly
alias fly-login-hb="fly -t housing-benefit login -c https://concourse.mgmt.exchange -n housing-benefit"
alias fly-login="fly -t housing-benefit login -b"

# Istio - install & uninstall locally with these scripts
alias install-istio="cd ~/Documents/repository/kubernetes/istio-1.3.3; ./install-istio.sh; cd -"
alias uninstall-istio="cd ~/Documents/repository/kubernetes/istio-1.3.3; ./uninstall-istio.sh; cd -"


export PATH=$HOME/brew/bin:$HOME/bin:$HOME/Library/Python/2.7/bin:$HOME/node_modules/bin:$HOME/Library/Python/3.7/bin:$PATH

export NODE_EXTRA_CA_CERTS=/etc/ssl/certs/zscaler.pem
export GOPATH="${HOME}/.go"
export GOROOT="$(brew --prefix golang)/libexec"
export PATH="$PATH:${GOPATH}/bin:${GOROOT}/bin"
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.2.jdk/Contents/Home
export CACERTS=$JAVA_HOME/lib/security/cacerts

export ANCHORE_CLI_USER=admin
export ANCHORE_CLI_PASS=admin
export ANCHORE_CLI_URL=https://anchore.mgmt.exchange/v1/


# points maven to local copy of cacerts
# localCacerts="-Djavax.net.ssl.trustStore=/Users/chris.hulley/Documents/certificates/cacerts"
# export MAVEN_OPTS="$localCacerts -DargLine=\"$localCacerts\""

