package org.ksplus.ehr.rm.common.change_control;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.ksplus.ehr.base.base_types.identification.ObjectId;
import org.ksplus.ehr.base.base_types.identification.ObjectRef;

class VersionedObjectTest {

    @Test
    void should_provide_getters() {
        UUID id = UUID.randomUUID();
        ObjectRef objectRef = randomObjectRef();

        VersionedObject<Patient> result = VersionedObject.<Patient>builder()
            .id(id)
            .ownerId(objectRef)
            .build();

        assertThat(result.getUid().getValue(), equalTo(id.toString()));
        assertThat(result.getOwnerId(), equalTo(objectRef));
    }

    private static ObjectRef randomObjectRef() {
        return ObjectRef.builder()
            .namespace("demographic")
            .objectId(new ObjectId(UUID.randomUUID()))
            .type("ANY")
            .build();
    }
}
