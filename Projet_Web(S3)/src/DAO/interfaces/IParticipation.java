package DAO.interfaces;

import Models.ParticipationF;
import Models.ParticipationB;

public interface IParticipation {
	
	ParticipationF insertParticipationF(ParticipationF partf);
	ParticipationB insertParticipationB(ParticipationB partb);
}
