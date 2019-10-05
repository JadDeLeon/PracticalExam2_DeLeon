package com.deleon.practicalexam2_deleon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveData(View view) throws IOException {
        String FILENAME = "data1.txt";
        FileOutputStream fosWriter = null;
        fosWriter = openFileOutput(FILENAME, Context.MODE_PRIVATE);
        if(((CheckBox)(findViewById(R.id.cb_IT205))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.cb_IT205)).getText().toString() + ", ").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.cb_ICS115))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.cb_ICS115)).getText().toString() + ", ").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.cb_IT_Elec2))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.cb_IT_Elec2)).getText().toString() + ", ").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.cb_ICS125))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.cb_ICS125)).getText().toString() + ", ").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.cb_IT_Elec3))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.cb_IT_Elec3)).getText().toString() + ", ").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.cb_IT_Elec4))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.cb_IT_Elec4)).getText().toString() + ", ").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.cb_F_Elec2))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.cb_F_Elec2)).getText().toString() + ", ").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.cb_F_Elec3))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.cb_F_Elec3)).getText().toString()).getBytes());
        }
        fosWriter.write(("_" + ((EditText)(findViewById(R.id.et_comments))).getText().toString()).getBytes());
        Toast.makeText(this,"Data Saved...", Toast.LENGTH_LONG).show();
    }

    public void summaryPage(View view) {
        Intent intent = new Intent(this, summary.class);
        startActivity(intent);
    }
}
