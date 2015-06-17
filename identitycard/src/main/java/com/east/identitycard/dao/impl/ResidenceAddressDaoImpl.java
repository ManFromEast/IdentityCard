package com.east.identitycard.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.east.identitycard.dao.ResidenceAddressDao;
import com.east.identitycard.entity.ResidenceAddress;

public class ResidenceAddressDaoImpl extends HibernateDaoSupport implements
		ResidenceAddressDao {

	public void saveResidenceAddress(ResidenceAddress residenceAddress) {
		getHibernateTemplate().save(residenceAddress);

	}

	public void updateResidenceAddress(ResidenceAddress residenceAddress) {
		getHibernateTemplate().update(residenceAddress);

	}

	public ResidenceAddress getResidenceAddress(int id) {
		return (ResidenceAddress) getHibernateTemplate().find("from ResidenceAddress where id=?", id);
	}

	public void deleteResidenceAddress(ResidenceAddress residenceAddress) {
		getHibernateTemplate().delete(residenceAddress);

	}

}
