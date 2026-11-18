package ir.mafia.saltanati;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.graphics.Color;
import android.view.View;
public class MainActivity extends Activity {
  private WebView web;
  @Override public void onCreate(Bundle b){super.onCreate(b);getWindow().setStatusBarColor(Color.rgb(16,11,24));getWindow().setNavigationBarColor(Color.rgb(16,11,24));web=new WebView(this);WebSettings s=web.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(true);s.setAllowContentAccess(false);s.setDatabaseEnabled(true);s.setDefaultTextEncodingName("UTF-8");web.setWebViewClient(new WebViewClient());web.setOverScrollMode(View.OVER_SCROLL_NEVER);setContentView(web);web.loadUrl("file:///android_asset/index.html");}
  @Override public void onBackPressed(){if(web!=null&&web.canGoBack())web.goBack();else super.onBackPressed();}
}