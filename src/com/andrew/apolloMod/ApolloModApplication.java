package com.andrew.apolloMod;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;

public class ApolloModApplication extends Application {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		MobclickAgent.setDebugMode(true);
	}
}
