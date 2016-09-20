package com.epam.javaacademy.FirstMavenPlugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "sayhi")
public class SayHi extends AbstractMojo {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hi");
    }
}
