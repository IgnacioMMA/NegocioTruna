package izan.example.negociotruna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import izan.example.negociotruna.R;

public class DulceView extends LinearLayout {

    private TextView txtNombre;
    private TextView txtPrecio;
    private ImageView imageView;

    public DulceView(Context context) {
        super(context);
        init();
    }

    public DulceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.viewdulce, this, true);
        txtNombre = findViewById(R.id.txtNombreDulce);
        txtPrecio = findViewById(R.id.txtPrecioDulce);
        imageView = findViewById(R.id.imageViewDulce);
    }

    public void setNombre(String nombre) {
        txtNombre.setText(nombre);
    }

    public void setPrecio(double precio) {
        txtPrecio.setText(String.valueOf(precio));
    }

    public void setImagenUrl(String url) {
        Glide.with(getContext()).load(url).into(imageView);
    }
}
