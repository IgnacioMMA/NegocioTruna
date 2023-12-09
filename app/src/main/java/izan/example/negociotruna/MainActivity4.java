// MainActivity4.java
package izan.example.negociotruna;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // Recibe los datos de la compra desde el Intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombreDulce = extras.getString("nombreDulce");
            int cantidadUnidades = extras.getInt("cantidadUnidades");
            double totalCompra = extras.getDouble("totalCompra");

            // Muestra los detalles de la compra en TextViews
            TextView txtNombreDulce = findViewById(R.id.txtNombreDulceCompra);
            TextView txtCantidadUnidades = findViewById(R.id.txtCantidadUnidades);
            TextView txtTotalCompra = findViewById(R.id.txtTotalCompra);

            txtNombreDulce.setText("Dulce: " + nombreDulce);
            txtCantidadUnidades.setText("Unidades: " + cantidadUnidades);
            txtTotalCompra.setText("Total: $" + String.format("%.2f", totalCompra));
        }
    }
}
