package com.east.identitycard.service.impl;

import com.east.identitycard.dao.IdentityCardDao;
import com.east.identitycard.entity.IdentityCard;
import com.east.identitycard.service.IdentityCardService;

public class IdentityCardServiceImpl implements IdentityCardService {

	IdentityCardDao identityCardDao;
	
	public void setIdentityCardDao(IdentityCardDao identityCardDao) {
		this.identityCardDao = identityCardDao;
	}

	public void save(IdentityCard identityCard) {
		identityCardDao.saveIdentityCard(identityCard);

	}

	public void update(IdentityCard identityCard) {
		identityCardDao.updateIdentityCard(identityCard);

	}

	public void delete(IdentityCard identityCard) {
		identityCardDao.deleteIdentityCard(identityCard);

	}

	public IdentityCard findByIdentityCardId(int id) {
		return identityCardDao.getIdentityCard(id);
	}

}
