pipelineJob('rest_multiplier_pipeline') {
    definition {
        cpsScm {
            scm {
                github 'zersoftwere/rest_multiplier_api', 'master'
                extensions { }
            }
            scriptFile 'Jenkinsfile'
        }
    }
}g