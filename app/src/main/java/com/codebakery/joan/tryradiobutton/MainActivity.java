package com.codebakery.joan.tryradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView = null;
    CheckBox checkBox = null;
    RadioGroup radioGroup = null;
    RadioButton radioButton1 = null;
    RadioButton radioButton2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                case R.id.radioButton1:
                    textView.setText(radioButton1.getText().toString());
                    break;
                case R.id.radioButton2 :
                    textView.setText(radioButton2.getText().toString());
                    break;
                default: break;
                }

            }
        });

    }

    public void onClickWidget(View view){
        checkBox = (CheckBox)view;

        if(checkBox.isChecked()) {
            textView.setText(checkBox.getText().toString());
            radioGroup.setVisibility(View.VISIBLE);
        } else {
            textView.setText(checkBox.getText().toString());
            radioGroup.setVisibility(View.INVISIBLE);
        }

    }
}
