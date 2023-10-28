package com.example.ktx_ute.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.firstapp.ql_ktx.model.Message;
import com.firstapp.ql_ktx.adapter.MessageAdapter;
import com.example.ktx_ute.R;
import com.vanniktech.emoji.EmojiManager;
import com.vanniktech.emoji.EmojiPopup;
import com.vanniktech.emoji.google.GoogleEmojiProvider;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BqlSinhVienActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinh_vien_bql_sv1);

        ImageView buttonBack = findViewById(R.id.buttonBack);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Thực hiện hành động để chuyển về giao diện trước, ví dụ:
                Intent intent = new Intent(BqlSinhVienActivity.this, MenuOptionsBqlActivity.class); // Thay thế CurrentActivity và SecondActivity bằng tên thích hợp của hoạt động của bạn.
                startActivity(intent); // Sử dụng phương thức onBackPressed() để quay lại màn hình trước đó.
            }
        });

        ImageButton btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Thực hiện hành động để chuyển sang giao diện activity_sinh_vien_bql_sv2.xml, ví dụ:
                Intent intent = new Intent(BqlSinhVienActivity.this, BqlSinhVienShowActivity.class); // Thay thế CurrentActivity và SecondActivity bằng tên thích hợp của hoạt động của bạn.
                startActivity(intent);
            }
        });

    }
}