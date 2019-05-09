package com.andy.junittest;

import java.util.HashMap;
import java.util.Map;

public class SmsManager {
	private SmsManager() {}
	public static String sendSms(String mobile, String content,String ip,String ua){
		String reString=null;
		String url = "http://sms.test.com/sms/send";
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("mobile", mobile);
		parameters.put("content", content);
		parameters.put("ip", ip);
        parameters.put("ua", ua);
		return HttpURLUtil.doPost(url, parameters);
	}
}
