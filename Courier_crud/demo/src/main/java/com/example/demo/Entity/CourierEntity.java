package com.example.demo.Entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "customer")
public class CourierEntity implements Serializable 
{
	private static final long serialVersionUID = -7280187378770180724L;
	@Id
	private String track;
	private Double bill_amount;
	private String address;
	private String date;
	private String deliveryboypin;
	public String getdeliveryboypin()
	{
		return deliveryboypin;
	}
	public void setdeliveryboypin(String deliveryboypin)
	{
		this.deliveryboypin=deliveryboypin;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public Double getBill_amount() {
		return bill_amount;
	}
	public void setBill_amount(Double bill_amount) {
		this.bill_amount = bill_amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Customer [deliveryboypin="+deliveryboypin+"tracking_id=" + track + ", bill_amount=" + bill_amount + ", address=" + address
				+ ", date=" + date + "]";
	}
	public CourierEntity(String deliveryboypin,String track, Double bill_amount, String address, String date) {
		super();
		this.deliveryboypin=deliveryboypin;
		this.track = track;
		this.bill_amount = bill_amount;
		this.address = address;
		this.date = date;
	}
	public CourierEntity() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
}
