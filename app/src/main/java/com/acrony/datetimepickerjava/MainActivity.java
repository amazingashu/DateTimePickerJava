package com.acrony.datetimepickerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvDate;
Button btnChoose;
DatePicker dtDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDate=(TextView)findViewById(R.id.tvDateSelected);
        btnChoose=(Button) findViewById(R.id.button1);
        dtDate=(DatePicker) findViewById(R.id.datepicker);

        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tvDate.setText(getCurrentDate());
            }
        });
    }

    public String getCurrentDate()
    {

        StringBuilder builder=new StringBuilder();
        builder.append((dtDate.getMonth()+1)+"/");
        builder.append((dtDate.getDayOfMonth())+"/");
        builder.append((dtDate.getYear())+"/");
        return builder.toString();
    }
}
