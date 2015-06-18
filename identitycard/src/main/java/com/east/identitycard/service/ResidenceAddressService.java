package com.east.identitycard.service;

import com.east.identitycard.entity.ResidenceAddress;

public interface ResidenceAddressService {

	public void saveResidenceAddress(ResidenceAddress residenceAddress);

	public void updateResidenceAddress(ResidenceAddress residenceAddress);

	public ResidenceAddress getResidenceAddress(int id);

	public void deleteResidenceAddress(ResidenceAddress residenceAddress);

}
