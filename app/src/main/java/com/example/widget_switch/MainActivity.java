package com.example.widget_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etweight, etheight;
    TextView resulttext;
    String compute, calculatorresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etweight = findViewById(R.id.etWeight);
        etheight = findViewById(R.id.etHeight);
        resulttext = findViewById(R.id.tvResult);
    }

    public void Compute(View view) {
        String S1 = etweight.getText().toString();
        String S2 = etheight.getText().toString();

        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2) / 100;

        float calculator = weightValue / (heightValue * heightValue);

        if (calculator < 16) {
            calculatorresult = "Severely Under Weight";
        }else if(calculator < 18.5) {
            calculatorresult = "Under Weight";
        }else if(calculator >= 18.5 && calculator <= 24.9) {
            calculatorresult = "Normal Weight";
        }else if (calculator >=25 && calculator <= 29.9) {
            calculatorresult = "Over Weight";
        }else {
            calculatorresult = "Obese";
        }

        compute = "Result\n\n" + calculator + "\n" + calculatorresult;

        resulttext.setText(compute);
    }


}
