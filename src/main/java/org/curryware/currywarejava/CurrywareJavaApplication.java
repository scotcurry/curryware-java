package org.curryware.currywarejava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrywareJavaApplication implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(CurrywareJavaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(CurrywareJavaApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.debug("Debug - Curryware application started");
    }
}
