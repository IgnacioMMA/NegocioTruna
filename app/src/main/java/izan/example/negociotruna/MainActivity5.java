// MainActivity5.java
package izan.example.negociotruna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        // Recibe los datos del dulce seleccionado desde el Intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombreDulce = extras.getString("nombre");
            double precioDulce = extras.getDouble("precio");

            // Muestra los detalles del dulce en TextViews
            TextView txtNombreDulce = findViewById(R.id.txtNombreDulce);
            TextView txtPrecioDulce = findViewById(R.id.txtPrecioDulce);
            NumberPicker unidades = findViewById(R.id.Unidades);
            txtNombreDulce.setText(nombreDulce);
            txtPrecioDulce.setText(String.format("$%.2f", precioDulce));

            // Configura el botón para realizar la compra
            Button btnComprar = findViewById(R.id.btnComprar);
            unidades.setMaxValue(99);
            unidades.setMinValue(1);

            btnComprar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int cantidadUnidades = unidades.getValue();
                    double totalCompra = cantidadUnidades * precioDulce;

                    // Envia los datos de la compra a MainActivity4 y luego inicia la actividad
                    enviarDatosCompra(MainActivity5.this, nombreDulce, cantidadUnidades, totalCompra);
                }
            });
        }
    }

    private void enviarDatosCompra(MainActivity5 activity, String nombreDulce, int cantidadUnidades, double totalCompra) {
        Intent intent = new Intent(activity, MainActivity4.class);
        intent.putExtra("nombreDulce", nombreDulce);
        intent.putExtra("cantidadUnidades", cantidadUnidades);
        intent.putExtra("totalCompra", totalCompra);
        Toast.makeText(MainActivity5.this, "Compra realizada con éxito", Toast.LENGTH_SHORT).show();

        startActivity(intent);  // Inicia la actividad después de enviar los datos
    }
}