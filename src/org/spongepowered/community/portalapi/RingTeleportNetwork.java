package org.spongepowered.community.portalapi;

import org.spongepowered.api.entity.Entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;

/**
 * Represents a series of TeleportDevices arranged in a ring.
 */
public class RingTeleportNetwork implements TeleportNetwork {
    private ArrayList<TeleportDevice> teleportDevices = new ArrayList<TeleportDevice>();

    @Override
    public @Nullable TeleportDevice globalEntryPoint() {
        synchronized (teleportDevices) {
            return (teleportDevices.isEmpty()) ? null : teleportDevices.get(0);
        }
    }

    @Override
    public TeleportDevice endpointFrom(@Nonnull final TeleportDevice entryPoint, @Nonnull final Entity entity) {
        synchronized(teleportDevices) {
            if (!teleportDevices.contains(entryPoint)) throw new IllegalArgumentException("Portal not in this network");
            if (teleportDevices.size() == 1) return entryPoint;
            int newindex = (teleportDevices.indexOf(entryPoint) + 1) % teleportDevices.size();
            return teleportDevices.get(newindex);
        }
    }

    public void add(final @Nonnull TeleportDevice teleportDevice) {
        synchronized(teleportDevices) {
            teleportDevices.add(teleportDevice);
        }
    }
}
