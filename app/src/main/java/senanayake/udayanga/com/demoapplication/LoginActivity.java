package senanayake.udayanga.com.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btnLogin(View view){
        EditText editTextUserName = (EditText) findViewById(R.id.editTextTextUserName);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextTextPassword);

        Log.i("INFO", "User name : " + editTextUserName.getText().toString() +
                "Password : " + editTextPassword.getText().toString() );

        Toast.makeText(LoginActivity.this, "User name : " + editTextUserName.getText().toString() +
                "Password : " + editTextPassword.getText().toString() , Toast.LENGTH_SHORT).show();

    }

    public void btnChangeImage(View view){
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cat2);
    }
}