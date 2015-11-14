package org.llaroqui.ornitorrinco.data.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.llaroqui.ornitorrinco.data.service.impl.model.Team;

public class Dao {

	/**
	 * Manager de entidades
	 */
	@PersistenceContext(unitName="ornitoJPA")
	protected EntityManager em;
	 
	/**
	 * Obtiene el manager de entidades JPA
	 * @return Manager de entidades JPA
	 */
    public EntityManager getEm() {
		return em;
	}

    /**
     * Establece el valor del manager de entidades JPA
     * @param em Nuevo valor del manager de entidades JPA
     */
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	public Team getTeamById(Integer id) {
		return em.find(Team.class, id);
	}
}
