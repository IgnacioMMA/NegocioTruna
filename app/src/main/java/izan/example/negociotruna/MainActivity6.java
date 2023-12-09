package izan.example.negociotruna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        // Configura el clic en las imágenes de galletas
        ImageView imgGalleta1 = findViewById(R.id.imgGalleta1);
        imgGalleta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetallesDulce("CocoChip", "$350.00");
            }
        });

        ImageView imgGalleta2 = findViewById(R.id.imgGalleta2);
        imgGalleta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetallesDulce("Cracker", "$250.00");
            }
        });

        ImageView imgGalleta3 = findViewById(R.id.imgGalleta3);
        imgGalleta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetallesDulce("Soda", "$300.00");
            }
        });

        // Configura el clic en las imágenes de helados
        ImageView imgHelado1 = findViewById(R.id.imgHelado1);
        imgHelado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetallesDulce("Chirimolla", "$400.00");
            }
        });

        ImageView imgHelado2 = findViewById(R.id.imgHelado2);
        imgHelado2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetallesDulce("Twingo (Milano)", "$450.00");
            }
        });

        ImageView imgHelado3 = findViewById(R.id.imgHelado3);
        imgHelado3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetallesDulce("Palito Frambuesa", "$400.00");
            }
        });

        // Configura el clic en las imágenes de chocolates
        ImageView imgChocolate1 = findViewById(R.id.imgChocolate1);
        imgChocolate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetallesDulce("Milka", "$1500.00");
            }
        });

        ImageView imgChocolate2 = findViewById(R.id.imgChocolate2);
        imgChocolate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetallesDulce("Vizzio", "$2000.00");
            }
        });

        ImageView imgChocolate3 = findViewById(R.id.imgChocolate3);
        imgChocolate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetallesDulce("Sahne Nuss", "$3000.00");
            }
        });
    }

    // Función para abrir la actividad de detalles del dulce
    private void abrirDetallesDulce(String nombre, String precio) {
        Intent intent = new Intent(this, MainActivity5.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("precio", Double.parseDouble(precio.substring(1))); // Parsea el precio a double
        startActivity(intent);
    }
}
