package uni.fmi.reserve.model;

import uni.fmi.reserve.service.ReserveService;

public class ReserveScreenModel {
	private String Email;
	private String Time;
	private String message;


	public void setEmail(final String email) {
		this.Email = email;
	}

	public void setTime(final String time) {
		this.Time = time;
		
	}

	public void click_reserve_button() {
		message = ReserveService.reserve(Email, Time);
	}

	public String getMessage() {
		return message;
	}

}
