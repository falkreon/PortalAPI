package org.spongepowered.community.portalapi.events;

/**
 * Called when a portal is removed from a network
 *
 */
public class PortalRemoveFromNetworkEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	private TeleportNetwork network;
	
	public PortalRemoveFromNetworkEvent (TeleportNetwork network) {
		this.network = network;
	}
	
	public TeleportNetwork getNetwork () {
		return this.network;
	}
	
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
