package com.liu.utils;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RainFell {

      private String a;

      public void doGet(String getUrl){
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet httpGet = new HttpGet(getUrl);
            CloseableHttpResponse response = null;
            String data = null;

            try {
                  response = httpClient.execute(httpGet);
                  HttpEntity responseEntity = response.getEntity();
                  System.out.println("响应状态为:" + response.getStatusLine());
                  if (responseEntity != null) {
                        a = EntityUtils.toString(responseEntity);
                        System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                        System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
                  }
            } catch (IOException | ParseException e) {
                  e.printStackTrace();
            } finally {
                  try {
                        if (httpClient != null) {
                              httpClient.close();
                        }
                        if (response != null) {
                              response.close();
                        }
                  } catch (IOException e) {
                        e.printStackTrace();
                  }
            }
      }

      public String getA() {
            return a;
      }
}
