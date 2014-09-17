package org.spongepowered.community.portalapi.listeners;

import org.spongepowered.community.portalapi.TeleportDevice;
import org.spongepowered.community.portalapi.events.PortalCreaeEvent;

public class PortalCreateEventListener {
	@EventHandler
	public onPortalCreate (PortalCreaeEvent event) {
		TeleportDevice portalDevice = new TeleportDevice(event.getPortalName());
	}
}
