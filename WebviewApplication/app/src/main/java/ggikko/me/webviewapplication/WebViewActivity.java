package ggikko.me.webviewapplication;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WebViewActivity extends AppCompatActivity {

    /** static url */
    public static String baseURL = "http://www.naver.com";

    /** view inject */
    @Bind(R.id.webview) WebView mWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        /** view bind */
        ButterKnife.bind(this);

        mWebview.setWebViewClient(new CustomWebViewClient());

        /** 캐시 설정, javascript 설정 등등 */
//        mWebview.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
//        mWebview.getSettings().setJavaScriptEnabled(true);


        mWebview.loadUrl(baseURL);

    }



    /** webview custom client
     *  여기서 조작하면 됨
     */
    public class CustomWebViewClient extends WebViewClient{

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            /** 페이지 랜더링 끝났을 때 */
        }
    }
}
