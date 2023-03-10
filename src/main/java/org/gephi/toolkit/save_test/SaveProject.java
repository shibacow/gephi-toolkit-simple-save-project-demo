/*
 */
package org.gephi.toolkit.save_test;

import java.io.File;
import java.io.IOException;

import org.openide.util.Lookup;
import org.gephi.project.api.ProjectController;
import org.gephi.graph.api.GraphModel;
import org.gephi.project.api.Workspace;

import org.gephi.graph.api.DirectedGraph;
import org.gephi.graph.api.GraphController;

import java.util.logging.Logger;
import java.util.logging.Level;

public class SaveProject {

    public void script() {
        Logger logger = Logger.getLogger(SaveProject.class.getName());
        logger.setLevel(Level.INFO);
        ProjectController pc = Lookup.getDefault().lookup(ProjectController.class);
        logger.info("start pc");
        pc.newProject();
        ///pc.openProject(new File("外事.gephi")).run();
        Workspace workspace = pc.getCurrentWorkspace();

        GraphModel graphModel = Lookup.getDefault().lookup(GraphController.class).getGraphModel();
        DirectedGraph graph = graphModel.getDirectedGraph();
        System.out.println("Nodes: " + graph.getNodeCount());
        System.out.println("Edges: " + graph.getEdgeCount());
        logger.info("save project");
        try{
            File save_file = new File("save_project.gephi");
            save_file.createNewFile(); //work around
            pc.saveProject(pc.getCurrentProject(),save_file);
            if(save_file.exists()){
                logger.info("save_project.gephi is exists");
           }else{
                logger.info("save_project.gephi is not exists");
            }
            logger.info("saved project");
        }catch(IOException err){
            err.printStackTrace();
        }
    }
}
