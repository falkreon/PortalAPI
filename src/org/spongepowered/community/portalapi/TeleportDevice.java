package org.spongepowered.community.portalapi;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Represents a single touchstone, waypoint, portal, stargate, or other concept which can cause a player to be
 * teleported from one place to another.
 */
public class TeleportDevice {
    private @Nonnull  String              name;
    private @Nullable TeleportNetwork network;

    /**
     * Create a new TeleportDevice
     * @param name
     */
    public TeleportDevice(final String name) {
        this.name = name;
        this.network = null;
    }

    /**
     * @return the case-sensitive name of this TeleportDevice
     */
    public @Nonnull String getName() {
        return name;
    }

    /**
     * @return the PortalNetwork which this object belongs to.
     */
    public @Nullable TeleportNetwork getNetwork() {
        return network;
    }

    /**
     * Informs this TeleportDevice that it is a member of the specified PortalNetwork. Does not actually add it to
     * the network.
     */
    public void setNetwork(@Nullable final TeleportNetwork network) {
        this.network = network;
    }
}
