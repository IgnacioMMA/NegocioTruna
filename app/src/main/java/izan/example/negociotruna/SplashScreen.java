package izan.example.negociotruna;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    // Aquí puedes agregar la lógica para la pantalla de inicio (Splash)
    // Puedes mostrar un logo, animación, etc.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Agrega el código necesario aquí

        // Después de mostrar el Splash, inicia LoginActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish(); // Esto evita que el usuario vuelva a la pantalla de inicio al presionar "Atrás"
    }
}