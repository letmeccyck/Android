package com.example.webview;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button mButton;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startBrowser();
    }

    boolean startBrowser() {
        mButton = findViewById(R.id.button);
        mEditText = findViewById(R.id.input);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                String url = "https://" + mEditText.getText().toString(); //加上协议
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        return true;
    }
}