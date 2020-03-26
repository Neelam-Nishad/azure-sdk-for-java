/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import java.util.List;
import com.microsoft.azure.management.apimanagement.v2019_12_01.PolicyDescriptionContract;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Descriptions of APIM policies.
 */
public class PolicyDescriptionCollectionInner {
    /**
     * Descriptions of APIM policies.
     */
    @JsonProperty(value = "value")
    private List<PolicyDescriptionContract> value;

    /**
     * Total record count number.
     */
    @JsonProperty(value = "count")
    private Long count;

    /**
     * Get descriptions of APIM policies.
     *
     * @return the value value
     */
    public List<PolicyDescriptionContract> value() {
        return this.value;
    }

    /**
     * Set descriptions of APIM policies.
     *
     * @param value the value value to set
     * @return the PolicyDescriptionCollectionInner object itself.
     */
    public PolicyDescriptionCollectionInner withValue(List<PolicyDescriptionContract> value) {
        this.value = value;
        return this;
    }

    /**
     * Get total record count number.
     *
     * @return the count value
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set total record count number.
     *
     * @param count the count value to set
     * @return the PolicyDescriptionCollectionInner object itself.
     */
    public PolicyDescriptionCollectionInner withCount(Long count) {
        this.count = count;
        return this;
    }

}