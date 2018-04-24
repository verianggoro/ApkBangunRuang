package com.example.veri.aplhitungbangun;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private TextView tvHasil;
    private EditText editText, editText1;
    private Button buttonKel, buttonluas, buttonDel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView TvHasil = (TextView) findViewById(R.id.tvhasil);
        final EditText editText = (EditText) findViewById(R.id.ET_1);
        final EditText editText1 = (EditText) findViewById(R.id.ET_2);
        Button buttonKel = (Button) findViewById(R.id.btnKel);
        Button buttonluas = (Button) findViewById(R.id.btnLuas);
        Button buttonDel = (Button) findViewById(R.id.btnHapus);
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
                    try {
                        int panjang = Integer.parseInt(editText.getText().toString());
                        int lebar = Integer.parseInt(editText1.getText().toString());
                        int luas = panjang * lebar;
                        TvHasil.setText(Integer.toString(luas));
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
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
                    try {
                        int panjang = Integer.parseInt(editText.toString());
                        int lebar = Integer.parseInt(editText1.toString());
                        int Kel = (2*panjang) +(2*lebar);
                        TvHasil.setText(Integer.toString(Kel));
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                editText1.setText("");
                TvHasil.setText("0");
            }
        });
    }
    /*
        if (editText.length() == 0 && editText1.length() == 0) {
            Toast.makeText(getApplication(), "Panjang dan Lebar Harus Terisi", Toast.LENGTH_LONG).show();
        } else if (editText.length() == 0) {
            Toast.makeText(getApplication(), "Panjang tidak boleh kosong", Toast.LENGTH_LONG).show();
        } else if (editText1.length() == 0) {
            Toast.makeText(getApplication(), "Lebar Tidak boleh kosong", Toast.LENGTH_LONG).show();
        } else {
            try {
                int panjang = Integer.parseInt(editText.getText().toString());
                int lebar = Integer.parseInt(editText1.getText().toString());
                int luas = panjang * lebar;
                txtView.setText(String.valueOf(luas));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
*/


  /*
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
                int kel = 2 * (panjang + lebar);
                txtView.setText(String.valueOf(kel));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    */
}
