package org.spongepowered.community.portalapi.events;

/**
 * Called when a portal is created
 *
 */
public class PortalCreateEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	String name;
	
	public PortalCreateEvent (String name) {
		this.name = name;
	}

    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
    
    public String getPortalName () {
    	return this.name;
    }
}
