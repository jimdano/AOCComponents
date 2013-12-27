package fr.istic.aoc.components.api;

public interface IMateriel {

	IClavier getClavier();
	
	IHorloge getHorloge();
	
	IAfficheur getAfficheur();
	
	IEmetteurSonore getEmetteur();
	
	IMolette getMolette();
}
