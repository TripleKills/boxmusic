package com.andrew.apolloMod.umeng;

import android.app.ListActivity;

import com.umeng.analytics.MobclickAgent;

public class BaseListActivity extends ListActivity{
	public void onResume() {
	    super.onResume();
	    MobclickAgent.onResume(this);
	}
	public void onPause() {
	    super.onPause();
	    MobclickAgent.onPause(this);
	}
}
