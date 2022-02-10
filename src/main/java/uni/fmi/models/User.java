package uni.fmi.models;

import java.util.Set;

public class User {

	private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Role role;
    private Set<FreeHour> freeHours;
    private Set<Reserve> reserves;
	
    public User(final String firstName, final String lastName, final String email, final String phoneNumber) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.email = email;
    	this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Reserve> getReservations() {
        return reserves;
    }

    public void setReservation(Set<Reserve> reserves) {
        this.reserves = reserves;
    }

    public Set<FreeHour> getFreeHours() {
        return freeHours;
    }

    public void setAvailableHour(Set<FreeHour> freeHours) {
        this.freeHours = freeHours;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}