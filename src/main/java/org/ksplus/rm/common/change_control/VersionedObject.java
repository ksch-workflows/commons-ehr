package org.ksplus.rm.common.change_control;


import java.util.UUID;

import org.ksplus.base.base_types.identification.HierObjectId;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
public class VersionedObject<T> implements org.openehr.rm.common.change_control.VersionedObject<T> {

    private final UUID id;

    @Override
    public HierObjectId getUid() {
        return new HierObjectId(id);
    }
}
