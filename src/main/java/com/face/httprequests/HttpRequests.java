package com.face.httprequests;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.face.constants.Constants;

public class HttpRequests {
	
	public static void SendRequest(HttpRequestBase request)
	{
		request.setHeader("Ocp-Apim-Subscription-Key", Constants.getSubsriptionKey());
		
		try
		{
			HttpClient httpClient = new DefaultHttpClient();
			HttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				System.out.println(EntityUtils.toString(entity));
			}
		}catch(
		Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
