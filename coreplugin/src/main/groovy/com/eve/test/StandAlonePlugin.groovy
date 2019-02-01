package com.eve.test
import org.gradle.api.Plugin
import org.gradle.api.Project

class StandAlonePlugin implements Plugin<Project> {
    void apply(Project project) {
        note()
        //create an extension object:Whyn,so others can config via Whyn
        project.extensions.create("myRun", YNExtension)
        project.task('myRun'){
            group = "test"
            description = "gradle Standalone project demo,shares everywhere"
            doLast{
                println '**************************************'
                println "$project.myRun.description"
                println '**************************************'
                println 'CWW HELLO EVE'
                println 'AGAIN ONE'
                println 'CWW END'
            }

        }
    }

    private void note(){
        println '------------------------'
        println 'apply  StandAlonePlugin'
        println 'EVE  EVE EVE'
        println '------------------------'
    }
}

class YNExtension {
    String description = 'default description'
}
