package com.example.realestate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Landdetailssale 
{
	
	public Landdetailssale() {
				super();
			}
			public Landdetailssale(String contactnumber, String vendorname, String landarea, String landsize,String amount, String contactmail) {
				super();
				this.contactnumber = contactnumber;
				this.vendorname = vendorname;
				this.landarea = landarea;
				this.landsize = landsize;
				this.amount=amount;
				this.contactmail = contactmail;
			}
			public String getContactnumber() {
				return contactnumber;
			}
			public void setContactnumber(String contactnumber) {
				this.contactnumber = contactnumber;
			}
			public String getVendorname() {
				return vendorname;
			}
			public void setVendorname(String vendorname) {
				this.vendorname = vendorname;
			}
			public String getLandarea() {
				return landarea;
			}
			public void setLandarea(String landarea) {
				this.landarea = landarea;
			}
			public String getLandsize() {
				return landsize;
			}
			public void setLandsize(String landsize) {
				this.landsize = landsize;
			}
			public String getContactmail() {
				return contactmail;
			}
			public void setContactmail(String contactmail) {
				this.contactmail = contactmail;
			}
			@Id
			private String contactnumber;
			private String vendorname;
			private String landarea;
			private String landsize;
			private String amount;
			public String getAmount() {
				return amount;
			}
			public void setAmount(String amount) {
				this.amount = amount;
			}
			private String contactmail;
			

		}





