package eu.openminted.resync.server.source.filesystem;

import eu.openminted.resync.server.source.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.StandardWatchEventKinds.*;


/**
 * @author Giorgio Basile
 * @version 1.0
 * @since 10/01/2017
 */

public class FolderSource extends WatchDir implements Source {

    private final Log logger = LogFactory.getLog(getClass());

    private static final boolean RECURSIVE = true;
    private static final boolean HIDDEN = false;

    public FolderSource(Path folder) throws IOException {
        super(folder, RECURSIVE, HIDDEN);
        // register directory and process its events
        registerDirectory();
    }

    @Override
    public void scanResources() {
        //TODO
    }

    @Override
    public void createResource() {
        //TODO
    }

    @Override
    public void updateResource() {
        //TODO
    }

    @Override
    public void deleteResource() {
        //TODO
    }

    @Override
    public void readResource() {
        //TODO
    }

    @Override
    public void onCreate(Path filePath) {
        logger.info(String.format("%s: %s\n", ENTRY_CREATE, filePath));
        stopWatcher();
    }

    @Override
    public void onModify(Path filePath) {
        logger.info(String.format("%s: %s\n", ENTRY_MODIFY, filePath));
        stopWatcher();
    }

    @Override
    public void onDelete(Path filePath) {
        logger.info(String.format("%s: %s\n", ENTRY_DELETE, filePath));
    }

    @Override
    public void notifyError(String message) {
        logger.error(message);
    }

    @Override
    public void onOverFlow() {
        logger.warn(OVERFLOW.name() + " event detected. Some file system events may have been lost or discarded.");
    }

    @Override
    public void stopWatcher(){
        super.stopWatcher();
        logger.info("Stop watching folder: " + getDirectory());
    }
}
