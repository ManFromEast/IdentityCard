package com.east.identitycard.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.east.identitycard.dao.IdentityCardDao;
import com.east.identitycard.entity.IdentityCard;

public class IdentityCardDaoImpl extends HibernateDaoSupport implements IdentityCardDao {

	public void saveIdentityCard(IdentityCard identityCard) {
		getHibernateTemplate().save(identityCard);

	}

	public IdentityCard getIdentityCard(int id) {
		IdentityCard identityCard = (IdentityCard) getHibernateTemplate().find(
				"from IdentityCard where id=?", id);
		return identityCard;
	}

	public void updateIdentityCard(IdentityCard identityCard) {
		getHibernateTemplate().update(identityCard);

	}

	public void deleteIdentityCard(IdentityCard identityCard) {
		getHibernateTemplate().delete(identityCard);

	}

}
