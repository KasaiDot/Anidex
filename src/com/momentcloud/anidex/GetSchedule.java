package com.momentcloud.anidex;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class GetSchedule extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_schedule);
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.loadUrl("http://animecalendar.net/");
	}
	
}