package com.spongepowered.community.events;

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
