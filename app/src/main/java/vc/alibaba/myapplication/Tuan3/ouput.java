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
public class ouput extends AppCompatActivity {
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ouput);

        ans = findViewById(R.id.ans);

        Intent i1 = getIntent();

        float so1 = Float.parseFloat(i1.getExtras().getString("so1"));
        float so2 = Float.parseFloat(i1.getExtras().getString("so2"));

        ans.setText(String.valueOf(so1 +  so2));
    }
}
