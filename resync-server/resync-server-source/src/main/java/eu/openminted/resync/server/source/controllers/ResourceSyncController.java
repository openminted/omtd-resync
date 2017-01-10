package eu.openminted.resync.server.source.controllers;

import eu.openminted.resync.server.source.utils.ResourceSyncConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ResourceSync server controllers
 *
 * @author  Giorgio Basile
 * @version 1.0
 * @since   08-01-2017
 */

@RestController
public class ResourceSyncController {

    private final Log logger = LogFactory.getLog(getClass());
    private static final String SOURCE_DESCRIPTION = "/" + ResourceSyncConstants.WELL_KNOWN + "/" + ResourceSyncConstants.RESOURCESYNC;

    @RequestMapping(SOURCE_DESCRIPTION)
    public String index(){
        logger.info("Received request at: " + SOURCE_DESCRIPTION);
        return "Greetings from Spring Boot!";
    }

}
