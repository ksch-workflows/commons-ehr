package org.ksplus.ehr.rm.common.change_control;


import java.util.UUID;

import org.ksplus.ehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
public class VersionedObject<T> implements org.openehr.rm.common.change_control.VersionedObject<T> {

    private final UUID id;

    private final ObjectRef ownerId;

    @Override
    public HierObjectId getUid() {
        return new HierObjectId(id);
    }

    @Override
    public ObjectRef getOwnerId() {
        return ownerId;
    }
}
