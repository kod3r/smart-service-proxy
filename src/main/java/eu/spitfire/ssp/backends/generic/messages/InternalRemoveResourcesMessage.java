package eu.spitfire.ssp.backends.generic.messages;

import java.net.URI;

/**
* Message to be written on the local server channel if a resource is to be removed from the list of registered
* services.
*
* @author Oliver Kleine
*/
public class InternalRemoveResourcesMessage {

    private URI resourceUri;

    public InternalRemoveResourcesMessage(URI resourceUri){
        this.resourceUri = resourceUri;
    }

    public URI getResourceUri() {
        return resourceUri;
    }

    public String toString(){
        return "[Remove resource message] " + resourceUri + " (uri)";
    }
}
