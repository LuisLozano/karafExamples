package org.llaroqui.ornitorrinco.data.srv;

import org.llaroqui.ornitorrinco.data.service.api.IDataService;
import org.llaroqui.ornitorrinco.data.service.api.ITeam;

public class DataService implements IDataService {

	private Dao theDao;
	
	public Dao getTheDao() {
		return theDao;
	}

	public void setTheDao(Dao theDao) {
		this.theDao = theDao;
	}

	public ITeam getTeamById(int id) {
		return theDao.getTeamById(id);
	}

}
