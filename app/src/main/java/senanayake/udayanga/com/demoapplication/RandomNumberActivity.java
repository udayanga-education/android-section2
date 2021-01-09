package senanayake.udayanga.com.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Random;

public class RandomNumberActivity extends AppCompatActivity {


    Button btnGuess;
    ImageView  imageStatus;
    EditText editTextRndNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);

        imageStatus = findViewById(R.id.imageStatus);
        imageStatus.setImageResource(R.drawable.wrong);
    }

    public void checkNumber(View view){
        int rnd = randomNumberGenerator();

        editTextRndNumber = findViewById(R.id.editTextRndNumber);
        imageStatus = findViewById(R.id.imageStatus);

        int number = Integer.parseInt(editTextRndNumber.getText().toString());

        if(rnd == number)
            imageStatus.setImageResource(R.drawable.correct);
        else
            imageStatus.setImageResource(R.drawable.wrong);

    }

    public int randomNumberGenerator(){
        Random random= new Random();
        return random.nextInt(20)+1;
    }
}