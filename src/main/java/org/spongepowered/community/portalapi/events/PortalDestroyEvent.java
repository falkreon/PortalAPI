package org.spongepowered.community.portalapi.events;

/**
 * Called when a portal is destroyed
 *
 */
public class PortalDestroyEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	
	public PortalDestroyEvent () {
	}
	
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
