package senanayake.udayanga.com.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtButtonTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClickFunction(View view){

        txtButtonTxt = findViewById(R.id.txtButtonTxt);
        txtButtonTxt.setText("Button clicked!!");

        Log.i("INFO", "Button pressed");
    }

    public void buttonClickClear(View view){
        txtButtonTxt = findViewById(R.id.txtButtonTxt);
        txtButtonTxt.setText("");
    }
}