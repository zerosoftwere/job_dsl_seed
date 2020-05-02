pipelineJob('rest_multiplier_pipeline') {
    definition {
        cpsScm {
            scm {
                github 'zersoftwere/rest_multiplier_api', 'master'
                scriptFile 'Jenkinsfile'
                extensions { }
            }
        }
    }
}g