package vc.alibaba.myapplication.Tuan3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import vc.alibaba.myapplication.R;

public class MainActivityTuan3 extends AppCompatActivity {
    EditText sothu1, sothu2;
    Button nutSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tuan3);
        sothu1 = findViewById(R.id.so1);
        sothu2 = findViewById(R.id.so2);
        nutSubmit = findViewById(R.id.button2);

        nutSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityTuan3.this,ouput.class);
                i.putExtra("so1", sothu1.getText().toString());
                i.putExtra("so2", sothu2.getText().toString());

                startActivity(i);
            }
        });
        sothu1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    resetData(sothu1);
                }
            }
        });
        sothu2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    resetData(sothu2);
                }
            }
        });
    }
    private void resetData(EditText data) {
        data.setText("");
    }
}
