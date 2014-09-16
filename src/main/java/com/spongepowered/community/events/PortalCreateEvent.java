package com.spongepowered.community.events;

/**
 * Called when a portal is created
 *
 */
public class PortalCreaeEvent extends Event{
    private static final HandlerList handlers = new HandlerList();
	
    public PortalCreateEvent () {
    }

    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
