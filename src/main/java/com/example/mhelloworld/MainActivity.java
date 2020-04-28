package com.example.mhelloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="Meedy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutlin);
        final WebView myWebView=findViewById(R.id.myWebview);
        myWebView.setWebViewClient(new WebViewClient());
        final Button reloadWebsiteButton =findViewById(R.id.reloadButton);
        reloadWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWebView.loadUrl("https://meeedy.blogspot.com");
            }
        });
        Log.i(TAG,"OnCreatedCalled");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"OnStartCalled");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"OnResumeCalled");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"OnPauseCalled");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"OnStopCalled");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"OnDestroyCalled");
    }
}
