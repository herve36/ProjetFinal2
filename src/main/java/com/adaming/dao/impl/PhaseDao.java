package com.adaming.dao.impl;

import org.springframework.stereotype.Repository;

import com.adaming.dao.interfaces.IDaoPhase;
import com.adaming.entities.Phase;

@Repository
public class PhaseDao extends DaoGenericImpl<Phase> implements IDaoPhase{

}
