package com.siriwat.sms.watchcat;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class SMSWatchcatTabWidget extends TabActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Resources res = getResources();
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		intent = new Intent().setClass(this, SMSWatchcatNewFilter.class);
		spec = tabHost
				.newTabSpec("add").setIndicator("Add",
					res.getDrawable(R.drawable.ic_tab_add))
				.setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, SMSWatchcatListFilter.class);
		spec = tabHost
				.newTabSpec("list").setIndicator("List",
					res.getDrawable(R.drawable.ic_tab_list))
				.setContent(intent);
		tabHost.addTab(spec);
	}
	
}