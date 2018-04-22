package com.example.lock_.mya;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Integer number;

    EditText numberInput;
    Button btn;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = (EditText) findViewById(R.id.editText);
        output = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userinput = numberInput.getText().toString();
                number = Integer.valueOf(userinput);

                output.setText(String.valueOf(randomintGen()));

            }
        });

    }

    private int randomintGen() {
        Random r = new Random();
        int ran = r.nextInt(7 - 1) + 1;
        return ran;
    }
}
