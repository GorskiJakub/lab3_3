package edu.iis.mto.time;

import org.joda.time.DateTime;

public class GetDateTime implements NewTimeSource {

	@Override
	public DateTime now() {
		// TODO Auto-generated method stub
		return new DateTime();
	}

}
