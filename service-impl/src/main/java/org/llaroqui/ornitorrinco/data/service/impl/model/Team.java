package org.llaroqui.ornitorrinco.data.service.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.llaroqui.ornitorrinco.data.service.api.ITeam;

@Entity
@Table(name="Team", schema = "public", 
		uniqueConstraints={
		   @UniqueConstraint(columnNames={"Name"})
		})
@NamedQuery(name="Team.findAll", query="SELECT c FROM Team c")
public class Team implements ITeam, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3041350120271135156L;

	/**
	 * Identificador
	 */
	@Id
	//@SequenceGenerator(name="CLIENTE_ID_GENERATOR", sequenceName="CLIENTE_ID_SEQ")
	//@GeneratedValue(strategy=GenerationType.AUTO, generator="CLIENTE_ID_GENERATOR")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Integer id;
	
	/**
	 * Nombre
	 */
	@Column(name="Name", nullable = false)	
	private String name;	
	
	public String getName() {
		return name;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
