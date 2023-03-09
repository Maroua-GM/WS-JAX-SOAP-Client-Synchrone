package fr.doranco.jaxws.etudiant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.xml.ws.fault.ServerSOAPFaultException;

import fr.doranco.jaxws.webservice.Etudiant;
import fr.doranco.jaxws.webservice.EtudiantService;
import fr.doranco.jaxws.webservice.EtudiantService_Service;
import fr.doranco.jaxws.webservice.Exception_Exception;

public class EtudiantWebServiceSynchroneTest {
	static EtudiantService etudiantPort;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		EtudiantService_Service etuService = new EtudiantService_Service();
		etudiantPort = etuService.getEtudiantPort();

	}

	@Test
	public void testAddEtudiant() throws Exception {
		Etudiant etudiantToAdded = new Etudiant();
		etudiantToAdded.setNom("TestNom");
		etudiantToAdded.setPrenom("TestPrenom");
		etudiantToAdded.setSpecialite("TestSpecialite");
		etudiantToAdded.setAge(35);
		Etudiant etudiantAdded = etudiantPort.addEtudiant(etudiantToAdded);
		assertEquals(etudiantAdded, etudiantToAdded);

	}

	@Test(expected = ServerSOAPFaultException.class)
	public void testAddEtudiantException() throws Exception_Exception {
		etudiantPort.addEtudiant(null);
	}

	@Test
	public void testGetEtudiants() {
		fail();
	}

	@Test
	public void testGetEtudiantById() {
		fail();
	}

}
