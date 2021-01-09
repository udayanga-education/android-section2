package senanayake.udayanga.com.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CurrencyActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
    }

    public void buttonAction(View view){

        EditText editTextNumber =(EditText)findViewById(R.id.editTextNumber);
        TextView textView = (TextView)findViewById(R.id.textView);

        double insertValue = Double.parseDouble(editTextNumber.getText().toString());
        double returnValue = insertValue * 1.87;

        textView.setText(String.format("%.2f", returnValue));
    }

}