package movil.unicauca.peliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import movil.unicauca.peliculas.databinding.ActivityDetailBinding;
import movil.unicauca.peliculas.models.Estrenos;
import movil.unicauca.peliculas.models.ProximosEstrenos;
import movil.unicauca.peliculas.util.Data;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_POS ="pos";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int pos = getIntent().getIntExtra(EXTRA_POS, 0);
        binding.setEstrenos(Data.datae.get(pos));

    }
}
