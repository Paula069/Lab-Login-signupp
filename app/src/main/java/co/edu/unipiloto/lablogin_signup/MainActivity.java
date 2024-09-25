package co.edu.unipiloto.lablogin_signup;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoginClick(View view) {
        Log.d("MainActivity", "Botón de login presionado");
        Intent intent = new Intent(this, LoginFormActivity.class);
        startActivity(intent);
    }
}
