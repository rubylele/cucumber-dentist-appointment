package uni.fmi.models;

import java.util.*;

public class Reserve {

	 private String ReserveNumber;
	 private String RequiredDate;
	 private String RequiredHour;
	 private FreeHour freeHour;
	 private User owner;
	
    public Reserve(String ReserveNumber, String RequiredDate, String RequiredHour, User owner) {
    	this.ReserveNumber = ReserveNumber;
    	this.RequiredDate = RequiredDate;
    	this.RequiredHour = RequiredHour;
    	this.owner = owner;
    }

    public String getReserveNumber() {
       return ReserveNumber;
    }

    public void setReserveNumber(String reserveNumber) {
        this.ReserveNumber = reserveNumber;
    }

    public String getRequestedDate() {
        return RequiredDate;
    }

    public String getRequiredHour() {
        return RequiredHour;
    }

    public void setRequiredDate(String fromDate) {
        this.RequiredDate = fromDate;
    }

    public void setRequiredHour(String fromHour) {
        this.RequiredHour = fromHour;
    }

    public FreeHour getFreeHour() {
        return getFreeHour();
    }
    
    public void setFreeHour(FreeHour freeHour) {
        this.freeHour = freeHour;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getOwner() {
        return owner;
    }

}