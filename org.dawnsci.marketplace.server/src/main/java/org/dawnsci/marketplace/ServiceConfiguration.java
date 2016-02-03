/*****************************************************************************
 * Copyright (c) 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Torkild U. Resheim - initial API and implementation
 ****************************************************************************/
package org.dawnsci.marketplace;

import org.dawnsci.marketplace.services.DataService;
import org.dawnsci.marketplace.services.FileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Torkild U. Resheim, Itema AS
 */
@Configuration
public class ServiceConfiguration {
		
	@Bean
	public DataService catalogService() {
		return new DataService();
	}
	
	@Bean
	public FileService fileService() {
		return new FileService();
	}
}
