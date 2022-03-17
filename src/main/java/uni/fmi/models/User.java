package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class User {

    private String Name;
    private String Email;
    private String Phone;
    private Set<FreeHour> free_hours;
    private Set<Reserve> reserves;
	private Set<Role> roles;

    public User(final String email) {
    	this.Email = email;
    }
    
    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
    public String getPhone() {
        return Phone;
    }
    public void setName(String name) {
    	this.Name = name;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public void setPhone(String phone) {
    	this.Phone = phone;
    }
    public Set<Reserve> getReserves() {
        return reserves;
    }
    public void setReserve(Set<Reserve> reserve) {
        this.reserves = reserves;
    }
    public Set<FreeHour> getFreeHours() {
        return free_hours;
    }

    public void setFreeHour(Set<FreeHour> free_hours) {
        this.free_hours = free_hours;
    }
    
    public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}