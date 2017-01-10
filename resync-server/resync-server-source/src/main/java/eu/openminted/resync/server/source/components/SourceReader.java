package eu.openminted.resync.server.source.components;

import eu.openminted.resync.server.source.exceptions.SourceConfigurationException;
import eu.openminted.resync.server.source.filesystem.FolderSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Determines the Source type, initializing the proper components
 *
 * @author  Giorgio Basile
 * @version 1.0
 * @since   08-01-2017
 */
@Component
public class SourceReader implements CommandLineRunner{

    private final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private SourceConfiguration sourceConfiguration;

    @Override
    public void run(String... strings) throws Exception {

        if(sourceConfiguration.getFolder() != null) {
            //create source from a file system directory
            Path folderPath = Paths.get(sourceConfiguration.getFolder());

            if (Files.notExists(folderPath) || !Files.isDirectory(folderPath)) {
                throw new FileNotFoundException(sourceConfiguration.getFolder() + " is not a directory.");
            } else {
                FolderSource folderSource = new FolderSource(folderPath);
                folderSource.startWatching();
            }
        }else{
            logger.error("Source initialization error");
            throw new SourceConfigurationException("Source initialization error");
        }

    }
}
