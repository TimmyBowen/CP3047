package com.titanitestudios;

import android.os.Bundle;
import android.app.Activity;
import android.app.Instrumentation;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class TitaniteActivity extends Activity {
	
	
	public WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titanite);
        wv = (WebView) findViewById(R.id.myWebView);
       // wv.setInitialScale(70);
        wv.loadUrl("http://titanitestudios.com/snake");
        
//        wv.setOnKeyListener(new OnKeyListener() {           
//            @Override
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
//                if (event.getAction()==KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_T) {
//                    System.out.println("gay");
//                    return true;
//                }
//                return false;
//            }
//        });
        
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        
        
        
    }

    
    public void turnDown(View view){
    	KeyEvent event = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_S);
    	wv.onKeyDown(KeyEvent.KEYCODE_S, event);
    	
    }
    
    public void turnRight(View view){
    	KeyEvent event = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_D);
    	wv.onKeyDown(KeyEvent.KEYCODE_D, event);
    	
    }
    
    public void turnLeft(View view){
    	KeyEvent event = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_A);
    	wv.onKeyDown(KeyEvent.KEYCODE_A, event);
    	
    }
    
    public void turnUp(View view){
    	KeyEvent event = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_W);
    	wv.onKeyDown(KeyEvent.KEYCODE_W, event);
    	
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.titanite, menu);
        return true;
    }
}







