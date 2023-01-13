package com.panosen;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class NexusPublishPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getLogger().info("okok");
    }
}
