package com.east.identitycard.dao;

import java.util.List;

import com.east.identitycard.entity.IdentityCard;

public interface IdentityCardDAO {

	public void saveIdentityCard(IdentityCard identityCard);

	public List<IdentityCard> getIdentityCards();

	public IdentityCard getIdentityCard();

	public void updateIdentityCard(IdentityCard identityCard);

	public void deleteIdentityCard(IdentityCard identityCard);
}
