package com.example.random23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 1 : Khai báo biến
    EditText mEdtSoThu1 , mEdtSoThu2;
    TextView mTvKetQua;
    Button mBtnCong,mBtnTru,mBtnNhan,mBtnChia,mBtnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 : Ánh xạ
        mEdtSoThu1 = findViewById(R.id.editTextSoThu1);
        mEdtSoThu2 = findViewById(R.id.editTextSoThu2);
        mTvKetQua = findViewById(R.id.textViewKetQua);
        mBtnCong = findViewById(R.id.buttonCong);
        mBtnTru = findViewById(R.id.buttonTru);
        mBtnNhan = findViewById(R.id.buttonNhan);
        mBtnChia = findViewById(R.id.buttonChia);
        mBtnReset = findViewById(R.id.buttonReset);

        // Hiển thị thông báo

        // built-in function
        // ctrl + p : xem tham số truyền vào

        // Toast.makeText(this,"Thong bao",Toast.LENGTH_LONG).show();

        // Kiểm tra dữ liệu trong system
        // Log.d("BBB",mBtnReset.getText().toString());

        // Luồng xử lý của chức năng

        mBtnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ 2 edittext

                String textSoThu1 = mEdtSoThu1.getText().toString();
                String textSoThu2 = mEdtSoThu2.getText().toString();

                if (textSoThu1.length() <= 0 || textSoThu2.length() <= 0){
                    Toast.makeText(MainActivity.this, "Chưa nhập đủ thông tin!!!", Toast.LENGTH_SHORT).show();
                    return;
                }

                int soThu1 = Integer.parseInt(textSoThu1);
                int soThu2 = Integer.parseInt(textSoThu2);

                int ketQua = soThu1 + soThu2;

                
                // 5 + 5 = 10
                 mTvKetQua.setText(soThu1 + " + " + soThu2 + " = " + ketQua);

            }
        });
    }
}