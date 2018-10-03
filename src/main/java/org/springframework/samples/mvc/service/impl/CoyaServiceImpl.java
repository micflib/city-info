package org.springframework.samples.mvc.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.samples.mvc.data.Constant;
import org.springframework.samples.mvc.service.CoyaService;
import org.springframework.stereotype.Service;

@Service
public class CoyaServiceImpl implements CoyaService {

	@Override
	public HashMap<String, String> getCityInformation(String cityName) throws Exception {
		String result;
		HashMap<String, String> hmap = new HashMap<String, String>();
		result = this.sendGet(Constant.CITY_URL+cityName);
		result = result.substring(1, result.length()-1);
		JSONObject resultJSON = new JSONObject(result);
		Object currencies = resultJSON.get("currencies");
		String currency = currencies.toString().substring(1, currencies.toString().length()-1);
		JSONObject currJson = new JSONObject(currency);
		hmap.put("country",  resultJSON.get("name").toString());
		hmap.put("cityName", resultJSON.get("capital").toString());
		hmap.put("currency", currJson.get("code").toString());
		return hmap;
	}
	
	@Override
	public HashMap<String, String> getWeatherInformation(String cityName) throws Exception {
		String result;
		HashMap<String, String> hmap = new HashMap<String, String>();
		result = this.sendGet(Constant.WEATHER_URL+cityName+Constant.APPID);
		JSONObject resultJSON = new JSONObject(result);
		Object weather = resultJSON.get("weather");
		String warr = weather.toString().substring(1, weather.toString().length()-1);
		JSONObject wJson = new JSONObject(warr);
		Object main = resultJSON.get("main");
		JSONObject mJson = new JSONObject(main);
		hmap.put("weather",  wJson.get("description").toString());
		hmap.put("temp", concertKelvinToCelsius(mJson.get("temp").toString()));
		return hmap;
	}
	
    private String sendGet(String url) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        System.out.println("Response code: "+con.getResponseCode());
        if(con.getResponseCode() != HttpServletResponse.SC_OK) {
        	throw new Exception();
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
		return response.toString();
    }
    
    public String concertKelvinToCelsius(String kelvinValue) {
    	float kelvin = Float.parseFloat(kelvinValue);
		float celsius = kelvin - 273.15F;
		StringBuilder strb = new StringBuilder();
		strb.append(celsius);
		return strb.toString();
    }
}
