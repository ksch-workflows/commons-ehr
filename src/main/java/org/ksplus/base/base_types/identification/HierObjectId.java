package org.ksplus.base.base_types.identification;

import java.util.UUID;

public class HierObjectId extends UidBasedId implements org.openehr.base.base_types.identification.HierObjectId {

    public HierObjectId(String value) {
        super(value);
    }

    public HierObjectId(UUID value) {
        super(value.toString());
    }
}
