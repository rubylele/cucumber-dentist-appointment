package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class Email {

    private String Link;
    private Reserve reserve;

    public Email() {
    }

  
    public Reserve getReserve() {
        // TODO implement here
        return reserve;
    }


    public void setReserve(Reserve reserve) {
        this.reserve = reserve;
    }

    public String getLink() {
        return Link;
    }
    public void setLink(String link) {
    	this.Link = link;
    }

}