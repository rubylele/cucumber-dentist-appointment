package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class Reserve {

	private String ReserveNumber;

	   
    private String Date;

    private String Hour;

	private Email email;
	private FreeHour free_hour;
	 private User owner;



	
    public Reserve() {
    }
    public String getReserveNumber() {
        return ReserveNumber;
    }

    public void setReserveNumber(String reserveNumber) {
        this.ReserveNumber = reserveNumber;
    }
    public String getDate() {
        return Date;
    }
    public String getHour() {
        return Hour;
    }
    public void setDate(String date) {
    	this.Date = date;
    }
    public void setHour(String hour) {
    	this.Hour = hour;
    }
    public FreeHour getFreeHour() {
		return free_hour;
	}
	public void setFreeHour(FreeHour freeHour) {
		this.free_hour = freeHour;
	}
   
	public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getOwner() {
        return owner;
    }
    
    public Email getEmail() {
        // TODO implement here
        return email;
    }
    public void setEmail(Email email) {
        this.email = email;
    }

}