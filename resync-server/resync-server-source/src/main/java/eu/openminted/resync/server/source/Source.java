package eu.openminted.resync.server.source;

/**
 * @author Giorgio Basile
 * @version 1.0
 * @since 10/01/2017
 */
public interface Source {

    void scanResources();

    void createResource();

    void updateResource();

    void deleteResource();

    void readResource();

}
