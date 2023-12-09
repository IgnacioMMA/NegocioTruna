package izan.example.negociotruna;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class DetallesDulce extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detallesdulces);

        // Recibir el objeto Dulce de la actividad anterior
        Dulce dulce = getIntent().getParcelableExtra("dulce");

        if (dulce != null) {
            // Mostrar detalles en los elementos de la interfaz de usuario
            TextView txtNombre = findViewById(R.id.txtNombreDulceDetalles);
            TextView txtPrecio = findViewById(R.id.txtPrecioDulceDetalles);
            ImageView imageView = findViewById(R.id.imageViewDetalles);

            txtNombre.setText(dulce.getNombre());
            txtPrecio.setText(String.format("$%.2f", dulce.getPrecio()));

            // Usar Picasso para cargar la imagen desde la URL
            Picasso.get().load(dulce.getUrlImagen()).into(imageView);
        }
    }
}
