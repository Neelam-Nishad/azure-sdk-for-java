/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB provisioned throughput settings object.
 */
public class ProvisionedThroughputSettingsResource {
    /**
     * Represents maximum throughput container can scale up to.
     */
    @JsonProperty(value = "maxThroughput", required = true)
    private int maxThroughput;

    /**
     * Cosmos DB resource auto-upgrade policy.
     */
    @JsonProperty(value = "autoUpgradePolicy")
    private AutoUpgradePolicyResource autoUpgradePolicy;

    /**
     * Represents target maximum throughput container can scale up to once
     * offer is no longer in pending state.
     */
    @JsonProperty(value = "targetMaxThroughput", access = JsonProperty.Access.WRITE_ONLY)
    private Integer targetMaxThroughput;

    /**
     * Get represents maximum throughput container can scale up to.
     *
     * @return the maxThroughput value
     */
    public int maxThroughput() {
        return this.maxThroughput;
    }

    /**
     * Set represents maximum throughput container can scale up to.
     *
     * @param maxThroughput the maxThroughput value to set
     * @return the ProvisionedThroughputSettingsResource object itself.
     */
    public ProvisionedThroughputSettingsResource withMaxThroughput(int maxThroughput) {
        this.maxThroughput = maxThroughput;
        return this;
    }

    /**
     * Get cosmos DB resource auto-upgrade policy.
     *
     * @return the autoUpgradePolicy value
     */
    public AutoUpgradePolicyResource autoUpgradePolicy() {
        return this.autoUpgradePolicy;
    }

    /**
     * Set cosmos DB resource auto-upgrade policy.
     *
     * @param autoUpgradePolicy the autoUpgradePolicy value to set
     * @return the ProvisionedThroughputSettingsResource object itself.
     */
    public ProvisionedThroughputSettingsResource withAutoUpgradePolicy(AutoUpgradePolicyResource autoUpgradePolicy) {
        this.autoUpgradePolicy = autoUpgradePolicy;
        return this;
    }

    /**
     * Get represents target maximum throughput container can scale up to once offer is no longer in pending state.
     *
     * @return the targetMaxThroughput value
     */
    public Integer targetMaxThroughput() {
        return this.targetMaxThroughput;
    }

}
