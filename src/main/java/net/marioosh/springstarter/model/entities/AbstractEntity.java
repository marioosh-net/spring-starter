package net.marioosh.springstarter.model.entities;

import javax.persistence.Transient;

import org.apache.log4j.Logger;


public abstract class AbstractEntity {
	@Transient
	protected Logger log = Logger.getRootLogger();
}
