package eu.openminted.resync.server.source.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * ResourceSync Source configuration
 *
 * @author  Giorgio Basile
 * @version 1.0
 * @since   08-01-2017
 */
@PropertySource(value = {"classpath:application.properties"})
@Component
public class SourceConfiguration {

    @Value("${folder:#{null}}")
    private String folder;

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

}
