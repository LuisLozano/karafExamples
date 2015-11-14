package org.llaroqui.ornitorrinco.cdi.servicecdi.impl;

import javax.inject.Inject;

import org.llaroqui.ornitorrinco.cdi.servicecdi.api.IDataServiceCDI;
import org.llaroqui.ornitorrinco.data.service.api.IDataService;
import org.llaroqui.ornitorrinco.data.service.api.ITeam;
import org.ops4j.pax.cdi.api.OsgiService;
import org.ops4j.pax.cdi.api.OsgiServiceProvider;

@OsgiServiceProvider
public class DataServiceCDI implements IDataServiceCDI {

	@Inject @OsgiService
	private IDataService dataService;
	
	public ITeam getBetterTeam() {
		return dataService.getTeamById(1);
	}

}
