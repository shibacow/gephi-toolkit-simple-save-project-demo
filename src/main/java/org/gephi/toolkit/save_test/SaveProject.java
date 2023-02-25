/*
 */
package org.gephi.toolkit.save_test;

import java.io.File;

import org.openide.util.Lookup;
import org.gephi.project.api.ProjectController;

import java.util.logging.Logger;
import java.util.logging.Level;

public class SaveProject {

    public void script() {
        Logger logger = Logger.getLogger(SaveProject.class.getName());
        logger.setLevel(Level.INFO);
        //Init a project - and therefore a workspace
        ProjectController pc = Lookup.getDefault().lookup(ProjectController.class);
        logger.info("start pc");
        pc.newProject();
        logger.info("save project");
        pc.saveProject(pc.getCurrentProject(),new File("save_project.gephi"));
        logger.info("saved project");
    }
}
