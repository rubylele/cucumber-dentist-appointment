package uni.fmi.models;

import java.util.*;

public class Reserve {

	 private static final String ReserveNumber = null;
	private String ReservationNumber;
	 private String RequiredDate;
	 private String RequiredHour;
	 private FreeHour FreeHour;
	 private User owner;
	private String RequiredDate1;
	private String RequiredHour1;
	
    public Reserve(String ReserveNumber, String RequiredDate, String RequiredHour, User owner) {
    	this.ReservationNumber = ReservationNumber;
    	this.RequiredDate = RequiredDate;
    	this.RequiredHour = RequiredHour;
    	this.owner = owner;
    }

    public String getReserveNumber() {
       return ReserveNumber;
    }

    public void setReserveNumber(String reserveNumber) {
        this.ReservationNumber = reserveNumber;
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

    public void setRequestedHour(String fromHour) {
        this.RequiredHour = fromHour;
    }

    public FreeHour getFreeHour() {
        return getFreeHour();
    }
    
    public void setFreeHour(FreeHour freeHour) {
        this.FreeHour = freeHour;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getOwner() {
        return owner;
    }

}