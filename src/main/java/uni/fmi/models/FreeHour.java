package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class FreeHour {

	private String Time;
    private User owner;
    private Reserve reserve;
    
    public FreeHour(final String time) {
    	this.Time = time;
    }

    public String getTime() {
        return Time;
    }
    public void setTime(String time) {
        this.Time = time;
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