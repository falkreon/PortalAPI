package com.spongepowered.community.events;

/**
 * Called when a portal is added to a network
 *
 */
public class PortalAddToNetworkEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	private TeleportNetwork network;
	
	public PortalAddToNetworkEvent (TeleportNetwork network) {
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
