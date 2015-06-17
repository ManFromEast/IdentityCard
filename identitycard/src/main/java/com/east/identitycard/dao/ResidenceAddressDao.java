package com.east.identitycard.dao;

import com.east.identitycard.entity.ResidenceAddress;

public interface ResidenceAddressDao {
	
	public void saveResidenceAddress(ResidenceAddress residenceAddress);
	
	public void updateResidenceAddress(ResidenceAddress residenceAddress);
	
	public ResidenceAddress getResidenceAddress(int id);
	
	public void deleteResidenceAddress(ResidenceAddress residenceAddress);

}
