package com.example.mymathematicaloperations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaration of components (editext & textview) and global variables (string and double)
    EditText input1, input2;
    String value1, value2;
    Double val1, val2, total;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference the components to the layout file
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        //Get the text entered in the editext and save it in the string
        value1 = input1.getText().toString();
        value2 = input2.getText().toString();

//        //Convert the sting to double
//        val1 = Double.parseDouble(value1);
//        val2 = Double.parseDouble(value2);

    }

    public void addition(View view) {
        //do the addition and display the results in the textview
        total = val1 + val2;
        // txtResult.setText(total.toString());
        String finalresult = String.valueOf(total);
        txtResult.setText(finalresult);
    }

    public void subtraction(View view) {
        //do the subtraction and display the results in the textview
        total = val1 - val2;
        //tvResult.setText(total.toString());
        String finalresult = String.valueOf(total);
        txtResult.setText(finalresult);
    }


}
