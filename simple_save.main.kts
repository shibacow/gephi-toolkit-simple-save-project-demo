#!/usr/bin/env kotlin

@file:DependsOn("lib/gephi-toolkit-0.10.1-all.jar")

/*
simple example code to save gephi file
 */

import java.io.File

import org.gephi.project.api.ProjectController
import org.openide.util.Lookup

fun main(args: Array<String>){
    val pc = Lookup.getDefault().lookup(ProjectController::class.java)
    pc.newProject()
    val out_gephi_file = File("simple_save.gephi");
    out_gephi_file.createNewFile();
    pc.saveProject(pc.getCurrentProject(), out_gephi_file)
    pc.closeCurrentProject()
}

main(args)

