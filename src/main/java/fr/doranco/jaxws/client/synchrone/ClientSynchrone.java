package fr.doranco.jaxws.client.synchrone;

import fr.doranco.jaxws.webservice.Etudiant;
import fr.doranco.jaxws.webservice.EtudiantService;
import fr.doranco.jaxws.webservice.EtudiantService_Service;

public class ClientSynchrone {
	public static void main(String[] args) {
		EtudiantService_Service service = new EtudiantService_Service();
		EtudiantService port = service.getEtudiantPort();

		Etudiant etudiantToAdded = new Etudiant();
		etudiantToAdded.setNom("client");
		etudiantToAdded.setPrenom("synchrone");
		etudiantToAdded.setSpecialite("web service");
		etudiantToAdded.setAge(35);
		try {
			// Etudiant etudiantAdded = port.addEtudiant(etudiantToAdded);
			port.getEtudiants().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
