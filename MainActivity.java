package com.projecttwenty.checkaip;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.ThumbnailUtils;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
//import com.overflowarchives.linkpreview.ViewListener;
//import com.overflowarchives.linkpreview.WhatsappPreview;
import com.projecttwenty.checkaip.responces.loginresponce;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainActivity extends AppCompatActivity {
    private Button downloadButton;
    EditText editText;
    Button button;

    String fileN = null ;
    public static final int MY_PERMISSIONS_REQUEST_WRITE_STORAGE = 123;
    boolean result;
    String urlString;
    Dialog downloadDialog;

    @SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        editText=findViewById(R.id.lik);
        editText.getText().toString();
//        preview=findViewById(R.id.link_preview);
        button=findViewById(R.id.load);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                preview.loadUrl("link", new ViewListener() {
//                    @Override
//                    public void onPreviewSuccess(boolean status) {
//                        // on success
//                    }
//                    @Override
//                    public void onFailedToLoad(@Nullable Exception e) {
//                        // on preview failed
//                    }
//                });
            }
        });



        }
    }