package eu.openminted.resync.server.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Server entry-point
 *
 * @author  Giorgio Basile
 * @version 1.0
 * @since   08-01-2017
 */

@SpringBootApplication
@ComponentScan(basePackages = {"eu.openminted.resync.server.source"})
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

}
