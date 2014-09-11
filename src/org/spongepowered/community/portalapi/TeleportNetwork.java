package org.spongepowered.community.portalapi;

import org.spongepowered.api.entity.Entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Describes some kind of organization of TeleportDevices which can be accessed from each other. It is assumed that
 * the "endpoint" TeleportDevice can be determined given only the "entrance" device and the Entity potentially being
 * moved. A TeleportNetwork also has a global entryPoint, potentially for inter-system transfer.
 */
public interface TeleportNetwork {
    /**
     * @return A sensible default device for people entering the system. Often this is just the world-spawn or the first
     *         portal on the list. May return null if the network is completely empty.
     */
    @Nullable TeleportDevice globalEntryPoint();

    /**
     * @return the Device the specified Entity would be teleported to if it enters the network from the specified Device
     */
    @Nullable TeleportDevice endpointFrom(@Nonnull final TeleportDevice entryPoint, @Nonnull final Entity entity);
}
