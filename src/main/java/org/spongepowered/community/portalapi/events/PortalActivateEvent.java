package org.spongepowered.community.portalapi.events;

/**
 * Called when a player or entity activates a portal
 *
 */
<<<<<<< HEAD:src/main/java/org/spongepowered/community/portalapi/events/PortalActivateEvent.java
public class PortalActivateEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	
	public PortalActivateEvent () {
	}
	
=======
public class PortalCreaeEvent extends Event{
    private static final HandlerList handlers = new HandlerList();
	
    public PortalCreateEvent () {
    }

>>>>>>> FETCH_HEAD:src/main/java/com/spongepowered/community/events/PortalCreateEvent.java
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
