package org.ksplus.ehr.base.base_types.identification;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class ObjectRefTest {

    @Test
    void should_provide_getters() {
        UUID id = UUID.randomUUID();

        ObjectRef result = ObjectRef.builder()
            .namespace("demographic")
            .objectId(new ObjectId(id))
            .type("ANY")
            .build();

        assertThat(result.getNamespace(), equalTo("demographic"));
        assertThat(result.getId().getValue(), equalTo(id.toString()));
        assertThat(result.getType(), equalTo("ANY"));
    }
}