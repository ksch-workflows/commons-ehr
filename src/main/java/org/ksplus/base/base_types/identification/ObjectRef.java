package org.ksplus.base.base_types.identification;

import org.openehr.base.base_types.identification.ObjectId;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@EqualsAndHashCode
public class ObjectRef implements org.openehr.base.base_types.identification.ObjectRef {

    private final String namespace;

    private final String type;

    private final ObjectId objectId;

    @Override
    public String getNamespace() {
        return namespace;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public ObjectId getId() {
        return objectId;
    }
}
