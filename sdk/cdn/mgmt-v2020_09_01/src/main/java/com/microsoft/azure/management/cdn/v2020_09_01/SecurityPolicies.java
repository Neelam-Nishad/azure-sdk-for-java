/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.SecurityPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SecurityPolicies.
 */
public interface SecurityPolicies extends SupportsCreating<SecurityPolicy.DefinitionStages.Blank>, HasInner<SecurityPoliciesInner> {
    /**
     * Gets an existing security policy within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the security policy under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SecurityPolicy> getAsync(String resourceGroupName, String profileName, String securityPolicyName);

    /**
     * Lists security policies associated with the profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SecurityPolicy> listByProfileAsync(final String resourceGroupName, final String profileName);

    /**
     * Deletes an existing security policy within profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param securityPolicyName Name of the Secret under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String profileName, String securityPolicyName);

}
