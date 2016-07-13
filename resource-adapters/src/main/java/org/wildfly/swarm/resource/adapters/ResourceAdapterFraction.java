/**
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.swarm.resource.adapters;

import org.wildfly.swarm.config.ResourceAdapters;
import org.wildfly.swarm.config.resource.adapters.ResourceAdapter;
import org.wildfly.swarm.spi.api.Fraction;
import org.wildfly.swarm.spi.api.annotations.Configuration;
import org.wildfly.swarm.spi.api.annotations.ExtensionClassName;
import org.wildfly.swarm.spi.api.annotations.ExtensionModule;
import org.wildfly.swarm.spi.api.annotations.MarshalDMR;

/**
 * @author Ralf Battenfeld
 */
@ExtensionModule("org.jboss.as.connector")
@ExtensionClassName("org.jboss.as.connector.subsystems.resourceadapters.ResourceAdaptersExtension")
@MarshalDMR
public class ResourceAdapterFraction extends ResourceAdapters<ResourceAdapterFraction> implements Fraction {

    @Override
    public ResourceAdapterFraction resourceAdapter(ResourceAdapter value) {
        return super.resourceAdapter(value);
    }

}
