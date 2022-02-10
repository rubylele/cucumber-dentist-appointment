package uni.fmi.models;

import java.util.*;

public class FreeHour {

	private String FromDate;
    private String FromHour;
    private String ToDate;
    private String ToHour;
    private User owner;
    private Reserve reserve;
	
    public FreeHour(String FromDate, String FromHour, String ToDate, String ToHour,
    		User owner) {
    	this.FromDate = FromDate;
    	this.FromHour = FromHour;
    	this.ToDate = ToDate;
    	this.ToHour = ToHour;
    	this.owner = owner;
    }
    
    public String getFromDate() {
        return FromDate;
    }

    public String getFromHour() {
        return FromHour;
    }

    public String getToDate() {
        return ToDate;
    }

    public String getToHour() {
        return ToHour;
    }

    public void setFromDate(String fromDate) {
        this.FromDate = fromDate;
    }

    public void setFromHour(String fromHour) {
        this.FromHour = fromHour;
    }

    public void setToDate(String toDate) {
        this.ToDate = toDate;
    }

    public void setToHour(String toHour) {
       this.ToHour = toHour;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getOwner() {
        return owner;
    }

    public Reserve getReserve() {
        return reserve;
    }

    public void setReserve(Reserve reserve) {
        this.reserve = reserve;
    }

}