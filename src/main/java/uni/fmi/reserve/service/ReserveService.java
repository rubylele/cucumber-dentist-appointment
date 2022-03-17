package uni.fmi.reserve.service;

import java.util.List;
import java.util.Collections;

import uni.fmi.models.User;
import uni.fmi.models.FreeHour;

public class ReserveService {

	
	private static List<User> userDB = Collections.singletonList(new User("Dmitry"));
	private static List<FreeHour> fr_hrDB = Collections.singletonList(new FreeHour("2022/27/04"));
	public static String reserve(String email, String time) {
		if ( null==time || null==email) {
			return "Enter email and time";
		}
		final boolean isUser=userDB.stream().anyMatch(u->email.equals(u.getEmail())) ;
		final boolean isTimeFree = fr_hrDB.stream().anyMatch(ah->time.equals(ah.getTime()));
		if (!isUser){
			return "Invalid email";
		}
		final boolean isExist = ((isUser)&&  (isTimeFree));
		return isExist?"Reservation is accepted": null;
	}
}
