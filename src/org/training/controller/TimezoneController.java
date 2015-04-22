package org.training.controller;

import java.util.TimeZone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.training.messages.TimezoneResponse;
import org.training.messages.TimezoneResponse.InvalidTimezoneException;

@Controller
public class TimezoneController {

	@RequestMapping( value = "/{timestamp:[\\d]+}/{region}/{city}", method = RequestMethod.GET )
	public @ResponseBody TimezoneResponse getTimezone( @PathVariable("timestamp") long timestamp,
			@PathVariable("region") String region, @PathVariable("city") String city ) {
		
		return new TimezoneResponse(String.format("%s/%s", region, city), timestamp);
	}
	
	@RequestMapping( value = "/{timestamp:[\\d]+}/{timezone}", method = RequestMethod.GET )
	public @ResponseBody TimezoneResponse getTimezone( @PathVariable("timestamp") long timestamp,
			@PathVariable("timezone") String timezone ) {

		return new TimezoneResponse(timezone, timestamp);
	}
	
	@RequestMapping( value = "/list", method = RequestMethod.GET )
	public @ResponseBody String[] getList() {
		return TimeZone.getAvailableIDs();
	}
	
	@ExceptionHandler(InvalidTimezoneException.class)
	public @ResponseBody TimezoneError onInvalidTimezone(InvalidTimezoneException e) {
		return new TimezoneError(e.getLocalizedMessage(),
			"Try /list for an exhaustive listing of accepted timezone formats");
	}
	
	public static class TimezoneError {
		public final String error, advice;

		public TimezoneError(String error, String advice) {
			this.error = error;
			this.advice = advice;
		}
	}
}
