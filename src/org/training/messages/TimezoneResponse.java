package org.training.messages;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class TimezoneResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private final String date;
	private final long timestamp;
	private final String display;
	private final String timezone;
	private final String offset;
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public static class InvalidTimezoneException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		public InvalidTimezoneException(String tz) {
			super(String.format("No timezone [%s] exists", tz));
		}
	}

	public TimezoneResponse( String tz, long epoch ) {
		if ( Arrays.stream(TimeZone.getAvailableIDs()).filter( t -> t.equals(tz) ).count() < 1 ) {
			throw new InvalidTimezoneException(tz);
		}
		
		TimeZone zone = TimeZone.getTimeZone(tz);
		long inMillis = epoch * 1000;
		
		date = formatDate(zone, inMillis);
		timestamp = epoch;
		display = zone.getDisplayName();
		timezone = zone.getID();
		offset = formatOffset(zone, inMillis);
	}
	
	public static String formatDate(TimeZone tz, long millis) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		format.setTimeZone(tz);
		return format.format(new Date(millis));
	}
	
	public static String formatOffset(TimeZone tz, long millis) {
		long offsHours = TimeUnit.MILLISECONDS.toHours(tz.getOffset(millis));
		long offsMinutes = TimeUnit.MILLISECONDS.toMinutes(tz.getOffset(millis))
				- TimeUnit.HOURS.toMinutes(offsHours);

		return String.format("UTC %s%d:%02d", offsHours > 0 ? "+" : "", offsHours, Math.abs(offsMinutes));
	}
	
	public String getDate() {
		return date;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getTimezone() {
		return timezone;
	}

	public String getDisplay() {
		return display;
	}

	public String getOffset() {
		return offset;
	}	
}
