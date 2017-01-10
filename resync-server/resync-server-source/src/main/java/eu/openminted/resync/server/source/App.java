package eu.openminted.resync.server.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Server entry-point
 *
 * @author  Giorgio Basile
 * @version 1.0
 * @since   08-01-2017
 */

@SpringBootApplication
@EnableAsync
@ComponentScan(basePackages = {"eu.openminted.resync.server.source"})
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

}
