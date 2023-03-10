#!/usr/bin/env kotlin

@file:DependsOn("lib/gephi-toolkit-0.10.0-all.jar")

//@file:DependsOn("gephi-toolkit-0.9.7-all.jar")

/*
 */

import java.io.File

import org.gephi.project.api.ProjectController
import org.openide.util.Lookup

fun main(args: Array<String>){
    val pc = Lookup.getDefault().lookup(ProjectController::class.java)
    pc.newProject()
    val out_gephi_file = File(gephi_file);
    out_gephi_file.createNewFile();
    pc.saveProject(pc.getCurrentProject(), out_gephi_file)
    pc.closeCurrentProject()
}

main(args)

