package com.east.identitycard.service;

import com.east.identitycard.entity.IdentityCard;

public interface IdentityCardService {

	public void save(IdentityCard identityCard);
	
	public void update(IdentityCard identityCard);
	
	public void delete(IdentityCard identityCard);
	
	public IdentityCard findByIdentityCardId(int id);
	
}
