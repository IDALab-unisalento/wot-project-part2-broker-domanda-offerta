package it.unisalento.brokerapp.domainClasses;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Viaggio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;


	float 	initialFreeCapacity;
	float 	costoPerKm;
	String  maximumWithdrawal;
	@ManyToOne(optional = true)
	Vector vector;

	@ManyToOne(optional = true)
	User company;


	

	@Override
	public String toString() {
		return "Viaggio [id=" + id + ", initialFreeCapacity=" + initialFreeCapacity + ", costoPerKm=" + costoPerKm
				+ ", maximumWithdrawal=" + maximumWithdrawal + ", vector=" + vector + ", company=" + company + "]";
	}



	public User getCompany() {
		return company;
	}



	public void setCompany(User company) {
		this.company = company;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Vector getVector() {
		return vector;
	}



	public void setVector(Vector vector) {
		this.vector = vector;
	}



	public float getInitialFreeCapacity() {
		return initialFreeCapacity;
	}



	public void setInitialFreeCapacity(float initialFreeCapacity) {
		this.initialFreeCapacity = initialFreeCapacity;
	}



	public float getCostoPerKm() {
		return costoPerKm;
	}



	public void setCostoPerKm(float costoPerKm) {
		this.costoPerKm = costoPerKm;
	}



	public String getMaximumWithdrawal() {
		return maximumWithdrawal;
	}



	public void setMaximumWithdrawal(String maximumWithdrawal) {
		this.maximumWithdrawal = maximumWithdrawal;
	}

	


	
}
