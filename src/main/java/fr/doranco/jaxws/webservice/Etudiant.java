
package fr.doranco.jaxws.webservice;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour etudiant complex type.
 *
 * <p>
 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="etudiant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etudiant", propOrder = { "age", "id", "nom", "prenom", "specialite" })
public class Etudiant {

	protected Integer age;
	protected Integer id;
	protected String nom;
	protected String prenom;
	protected String specialite;

	/**
	 * Obtient la valeur de la propri�t� age.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * D�finit la valeur de la propri�t� age.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setAge(Integer value) {
		this.age = value;
	}

	/**
	 * Obtient la valeur de la propri�t� id.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * D�finit la valeur de la propri�t� id.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Obtient la valeur de la propri�t� nom.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * D�finit la valeur de la propri�t� nom.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNom(String value) {
		this.nom = value;
	}

	/**
	 * Obtient la valeur de la propri�t� prenom.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * D�finit la valeur de la propri�t� prenom.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrenom(String value) {
		this.prenom = value;
	}

	/**
	 * Obtient la valeur de la propri�t� specialite.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * D�finit la valeur de la propri�t� specialite.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSpecialite(String value) {
		this.specialite = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, nom, prenom, specialite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Etudiant other = (Etudiant) obj;
		return Objects.equals(age, other.age) && Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom)
				&& Objects.equals(specialite, other.specialite);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Etudiant [");
		if (age != null) {
			builder.append("age=");
			builder.append(age);
			builder.append(", ");
		}
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (nom != null) {
			builder.append("nom=");
			builder.append(nom);
			builder.append(", ");
		}
		if (prenom != null) {
			builder.append("prenom=");
			builder.append(prenom);
			builder.append(", ");
		}
		if (specialite != null) {
			builder.append("specialite=");
			builder.append(specialite);
		}
		builder.append("]");
		return builder.toString();
	}

}
