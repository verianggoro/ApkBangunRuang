package com.example.veri.aplhitungbangun;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView tvHasil;
    EditText editText, editText1;
    Button buttonKel, buttonluas, buttonDel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHasil = (TextView) findViewById(R.id.tvhasil);
        editText = (EditText) findViewById(R.id.ET_1);
        editText1 = (EditText) findViewById(R.id.ET_2);
        buttonKel = (Button) findViewById(R.id.btnKel);
        buttonluas = (Button) findViewById(R.id.btnLuas);
        buttonDel = (Button) findViewById(R.id.btnHapus);


        buttonluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.length() == 0 && editText1.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang dan Lebar Harus Terisi", Toast.LENGTH_LONG).show();
                } else if (editText.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (editText1.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar Tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    int panjang = Integer.parseInt(editText.getText().toString());
                    int lebar = Integer.parseInt(editText1.getText().toString());
                    int luas = panjang * lebar;
                    tvHasil.setText(Integer.toString(luas));
                }
            }
        });
        buttonKel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.length() == 0 && editText1.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang dan Lebar Harus Terisi", Toast.LENGTH_LONG).show();
                } else if (editText.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (editText1.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar Tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    int panjang = Integer.parseInt(editText.getText().toString());
                    int lebar = Integer.parseInt(editText1.getText().toString());
                    int luas =2*(panjang + lebar);
                    tvHasil.setText(Integer.toString(luas));
                }
            }

        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.getText().clear();
                editText1.getText().clear();
                tvHasil.setText("0");
            }
        });
    }
}

        /*buttonKel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.length() == 0 && editText1.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang dan Lebar Harus Terisi", Toast.LENGTH_LONG).show();
                } else if (editText.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (editText1.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar Tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    try {
                        int panjang = Integer.parseInt(editText.toString());
                        int lebar = Integer.parseInt(editText1.toString());
                        int Keliling = lebar*panjang;
                        TvHasil.setText(Integer.parseInt(String.valueOf(Keliling)));
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });*/