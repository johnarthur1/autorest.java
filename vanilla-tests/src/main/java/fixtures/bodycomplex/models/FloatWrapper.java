package fixtures.bodycomplex.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FloatWrapper model. */
@Fluent
public final class FloatWrapper {
    /*
     * The field1 property.
     */
    @JsonProperty(value = "field1")
    private Float field1;

    /*
     * The field2 property.
     */
    @JsonProperty(value = "field2")
    private Float field2;

    /**
     * Get the field1 property: The field1 property.
     *
     * @return the field1 value.
     */
    public Float getField1() {
        return this.field1;
    }

    /**
     * Set the field1 property: The field1 property.
     *
     * @param field1 the field1 value to set.
     * @return the FloatWrapper object itself.
     */
    public FloatWrapper setField1(Float field1) {
        this.field1 = field1;
        return this;
    }

    /**
     * Get the field2 property: The field2 property.
     *
     * @return the field2 value.
     */
    public Float getField2() {
        return this.field2;
    }

    /**
     * Set the field2 property: The field2 property.
     *
     * @param field2 the field2 value to set.
     * @return the FloatWrapper object itself.
     */
    public FloatWrapper setField2(Float field2) {
        this.field2 = field2;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
