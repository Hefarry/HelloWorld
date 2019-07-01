package com.hefarry.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button2);
        final TextView tv1 = findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        tv1.setText("hello!");
                                        Log.d("MainActivity","modified!");
                                    }
                                }
        );

        RadioGroup radiogroup = findViewById(R.id.radioGroup);
        final RadioButton radiobutton1 = findViewById(R.id.rd1);
        final RadioButton radiobutton2 =  findViewById(R.id.rd2);

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == radiobutton1.getId()){
                    tv1.setText("男生");
                }else if(checkedId == radiobutton2.getId()){
                    tv1.setText("女生");
                }
            }
        });

    }
}
