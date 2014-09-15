package org.spongepowered.community.portalapi;

import com.google.common.collect.HashBiMap;
import org.spongepowered.api.entity.Entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Represents a series of point-to-point TeleportDevices in a 1:1 relationship.
 */
public class DirectedTeleportNetwork implements TeleportNetwork {
    private HashBiMap<TeleportDevice, TeleportDevice> deviceMap = HashBiMap.create();


    @Override
    public @Nullable TeleportDevice globalEntryPoint() {
        return (deviceMap.isEmpty()) ? null : deviceMap.keySet().iterator().next();
    }

    @Override
    public @Nullable TeleportDevice endpointFrom(@Nonnull final TeleportDevice entryPoint, @Nonnull final Entity entity) {
        if (deviceMap.containsKey(entryPoint)) return deviceMap.get(entryPoint);
        if (deviceMap.containsValue(entryPoint)) return deviceMap.inverse().get(entryPoint);

        return null;
    }

    public void add(final @Nonnull TeleportDevice pointA, final @Nonnull TeleportDevice pointB) {
        //Remove duplicates. I know that some of these are unnecessary but in a weird way it makes things more readable.
        if(deviceMap.containsKey(pointA)) deviceMap.remove(pointA);
        if(deviceMap.containsValue(pointA)) deviceMap.inverse().remove(pointA);
        if(deviceMap.containsKey(pointB)) deviceMap.remove(pointB);
        if(deviceMap.containsValue(pointB)) deviceMap.inverse().remove(pointB);

        deviceMap.put(pointA, pointB);
    }
}
