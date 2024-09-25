package co.edu.unipiloto.lablogin_signup;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginFormActivity extends AppCompatActivity { // Corrected here

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        // Referencias a los campos de texto
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
    }

    // Método para manejar el clic del botón de login
    public void onLoginClick(View view) {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Validar campos vacíos
        if (TextUtils.isEmpty(username)) {
            usernameEditText.setError("El usuario es requerido");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            passwordEditText.setError("La contraseña es requerida");
            return;
        }

        // Aquí puedes agregar lógica para autenticar al usuario
        if (authenticateUser(username, password)) {
            // Si las credenciales son correctas, navegar a la pantalla principal
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish(); // Finalizar la actividad de login
        } else {
            // Si las credenciales son incorrectas, mostrar un mensaje de error
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }

    // Método de autenticación ficticio (debes reemplazarlo con tu lógica de autenticación)
    private boolean authenticateUser(String username, String password) {
        // Lógica real de autenticación aquí (ej. consulta a la base de datos)
        return "usuario".equals(username) && "contraseña".equals(password);
    }

    // Método para manejar el clic del botón de registro
    public void onSignupClick(View view) {
        // Navegar a la actividad de registro
        Intent intent = new Intent(this, SignupFormActivity.class);
        startActivity(intent);
    }
}
