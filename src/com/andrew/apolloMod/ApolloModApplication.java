package com.andrew.apolloMod;

import org.json.JSONObject;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.onlineconfig.UmengOnlineConfigureListener;

public class ApolloModApplication extends Application {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		MobclickAgent.setDebugMode(true);
		MobclickAgent.updateOnlineConfig(this);
		MobclickAgent.setOnlineConfigureListener(new UmengOnlineConfigureListener(){
		      @Override
		      public void onDataReceived(JSONObject data) {
		    	String be_open =  MobclickAgent.getConfigParams(getApplicationContext(), "be_open");
		    	if (be_open.equalsIgnoreCase("true")) {
		    		// open be
		    		
		    	}
		      }
		});
	}
}
