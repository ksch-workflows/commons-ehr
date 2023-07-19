package org.ksplus.base.base_types.identification;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class ObjectIdTest {

    @Test
    void should_create_ObjectId_with_string_value() {
        ObjectId objectId = new ObjectId("XYZ-123");

        assertThat(objectId.getValue(), equalTo("XYZ-123"));
    }

    @Test
    void should_create_ObjectId_with_uuid_value() {
        UUID id = UUID.randomUUID();

        ObjectId objectId = new ObjectId(id);

        assertThat(objectId.getValue(), equalTo(id.toString()));
    }
}
