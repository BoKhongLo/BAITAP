package vc.alibaba.myapplication.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import vc.alibaba.myapplication.R;

public class ListViewComponent extends AppCompatActivity {
    ListView lv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_component);
        lv = findViewById(R.id.tuan22Listview);
        String[] arr = new String[]{"Mon 1", "mon 2", "mon 3", "mon 4", "mon 5"};
        //adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(adapter);

    }
}