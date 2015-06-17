package com.east.identitycard.dao;

import com.east.identitycard.entity.IdentityCard;

public interface IdentityCardDao {

	public void saveIdentityCard(IdentityCard identityCard);

	public IdentityCard getIdentityCard(int id);

	public void updateIdentityCard(IdentityCard identityCard);

	public void deleteIdentityCard(IdentityCard identityCard);
	
}
