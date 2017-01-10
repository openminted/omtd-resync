package eu.openminted.resync.server.source.exceptions;

/**
 * @author Giorgio Basile
 * @since 10/01/2017
 */

public class SourceConfigurationException extends Exception {

    public SourceConfigurationException() { super(); }
    public SourceConfigurationException(String message) { super(message); }
    public SourceConfigurationException(String message, Throwable cause) { super(message, cause); }
    public SourceConfigurationException(Throwable cause) { super(cause); }
}
