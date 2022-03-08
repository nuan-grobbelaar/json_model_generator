package com.github.nuangrobbelaar.jsonmodelgenerator.services

import com.intellij.openapi.project.Project
import com.github.nuangrobbelaar.jsonmodelgenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
