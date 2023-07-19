package org.ksplus.base.base_types.identification;

import java.util.UUID;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ObjectId implements org.openehr.base.base_types.identification.ObjectId {

    private final String value;

    public ObjectId(UUID value) {
        this.value = value.toString();
    }

    @Override
    public String getValue() {
        return value;
    }
}
