package org.ksplus.base.base_types.identification;

import org.openehr.base.base_types.identification.Uid;

import lombok.NonNull;

public class UidBasedId extends ObjectId implements org.openehr.base.base_types.identification.UidBasedId {

    public UidBasedId(@NonNull String value) {
        super(value);
    }

    @Override
    public Uid root() {
        if (!hasExtension()) {
            return this::getValue;
        }
        return () -> getValue().split("::")[0];
    }

    @Override
    public String extension() {
        if (!hasExtension()) {
            return "";
        }
        return getValue().split("::", 2)[1];
    }

    @Override
    public Boolean hasExtension() {
        return getValue().contains("::");
    }
}
