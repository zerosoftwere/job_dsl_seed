pipelineJob('rest_multiplier_pipeline') {
    definition {
        cpsScm {
            scm {
                github 'zerosoftwere/rest_multiplier_api', 'master'
            }
            scriptPath 'Jenkinsfile'
        }
    }
}