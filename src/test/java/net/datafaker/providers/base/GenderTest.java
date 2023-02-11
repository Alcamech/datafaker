package net.datafaker.providers.base;

import java.util.Arrays;
import java.util.Collection;

class GenderTest extends BaseFakerTest<BaseFaker> {

    @Override
    protected Collection<TestSpec> providerListTest() {
        Gender gender = faker.gender();
        return Arrays.asList(TestSpec.of(gender::types, "gender.types", "(\\w+ ?){1,2}"),
            TestSpec.of(gender::binaryTypes, "gender.binary_types"),
            TestSpec.of(gender::shortBinaryTypes, "gender.short_binary_types", "[fm]"));
    }

}
