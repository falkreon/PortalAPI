package org.spongepowered.community.portalapi.events;

/**
 * Called when a player or entity activates a portal
 *
 */
public class PortalActivateEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	
	public PortalActivateEvent () {
	}
	
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
}