package com.baeldung.lsd;

import com.baeldung.lsd.persistence.model.Project;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.lsd.persistence.repository.ProjectRepository;
import com.baeldung.lsd.persistence.repository.TaskRepository;

@SpringBootApplication
public class UsingQueryApp<Static> implements ApplicationRunner {

    private static final Logger LOG = LoggerFactory.getLogger(UsingQueryApp.class);

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TaskRepository taskRepository;


    public static void main(final String... args) {
        System.out.println("----2---");
        SpringApplication.run(UsingQueryApp.class, args);
        System.out.println("-----3-----");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("-----4-----");
        List<Project> projects = projectRepository.findWithNameAndDescription();
        LOG.info("Project 3:\n{}", projects);
    }
}
