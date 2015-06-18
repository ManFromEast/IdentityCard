package com.east.identitycard.service.impl;

import com.east.identitycard.dao.ResidenceAddressDao;
import com.east.identitycard.entity.ResidenceAddress;
import com.east.identitycard.service.ResidenceAddressService;

public class ResidenceAddressServiceImpl implements ResidenceAddressService {

	ResidenceAddressDao residenceAddressDao;
	
	public void setResidenceAddressDao(ResidenceAddressDao residenceAddressDao) {
		this.residenceAddressDao = residenceAddressDao;
	}

	public void saveResidenceAddress(ResidenceAddress residenceAddress) {
		residenceAddressDao.saveResidenceAddress(residenceAddress);

	}

	public void updateResidenceAddress(ResidenceAddress residenceAddress) {
		residenceAddressDao.updateResidenceAddress(residenceAddress);
	}

	public ResidenceAddress getResidenceAddress(int id) {
		
		return residenceAddressDao.getResidenceAddress(id);
	}

	public void deleteResidenceAddress(ResidenceAddress residenceAddress) {
		residenceAddressDao.deleteResidenceAddress(residenceAddress);

	}

}
