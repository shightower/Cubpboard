package org.bcc.cupboard.rest;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.bcc.cupboard.entity.CustomerBean;
import org.bcc.cupboard.entity.NonTefapOrderBean;
import org.bcc.cupboard.entity.TefapBean;

@XmlSeeAlso({
	CustomerBean.class,
	TefapBean.class,
	NonTefapOrderBean.class
})
@XmlType(propOrder = {"numResults", "entities"})
@XmlRootElement(name="CupboardWrapper")
public class EntityWrapper<T> implements Serializable {
	private static final long serialVersionUID = -2288677006842180339L;
	
	private List<T> entities;
	private int resultCount;
	
	public EntityWrapper() {
		
	}
	
	public EntityWrapper(List<T> entities) {
		setEntities(entities);
		setResultCount(entities.size());
	}

	@XmlElement(name="data")
	public List<T> getEntities() {
		return entities;
	}
	
	public void setEntities(List<T> entities) {
		this.entities = entities;
	}
	
	public int getResultCount() {
		return resultCount;
	}
	
	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}
}