job('rest multiplier demo') {
    scm {
        github('zerosoftwere/rest_multiplier_api', 'master')
    }

    triggers {
        githubPush()
    }

    wrappers {
        nodejs('nodejs')
    }

    steps {
        shell('npm install')
    }
}