package movil.unicauca.peliculas;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

import movil.unicauca.peliculas.Tabbed.TabbedActivity;
import movil.unicauca.peliculas.adapters.EstrenoAdapter;
import movil.unicauca.peliculas.databinding.ActivityMainBinding;
import movil.unicauca.peliculas.models.Estrenos;
import movil.unicauca.peliculas.models.ProximosEstrenos;
import movil.unicauca.peliculas.util.Data;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ActivityMainBinding binding;
    EstrenoAdapter adaptere;


    ProximosEstrenos adapterpe;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //binding.setHandler(this);

        Data.datae = new ArrayList<>();
        adaptere = new EstrenoAdapter(getLayoutInflater(), Data.datae);
        binding.setAdaptere(adaptere);

        binding.list1.setOnItemClickListener(this);

        loadPeliculas();


        /*Data.datape = new ArrayList<>();
        adapterpe = new ProximosEstrenos(getLayoutInflater(), Data.datape);
        binding.setAdaptere(adapterpe);*/ //pq no puedo poner otra lista, y como hago
    }

    private void loadPeliculas() {
        Estrenos e1 = new Estrenos();
        e1.setName("rapidos y furiosos");
        e1.setDate("2 de mayo 2017");
        e1.setImage("http://e.rpp-noticias.io/large/2016/04/28/12951100jpg.jpg");
        e1.setDuration("120 minutos");

        Estrenos e2 = new Estrenos();
        e2.setName("un jefe en pañales");
        e2.setDate("28 de abril de 2017");
        e2.setImage("http://tbsila.cdn.turner.com/tbsila/tntla/images/10192/451637/g/the-boss-baby-poster.jpg");
        e2.setDuration("100 minutos");

        Estrenos e3 = new Estrenos();
        e3.setName("Día del Atentado");
        e3.setDate("3 mayo de 2017");
        e3.setImage("https://i.ytimg.com/vi/0mNlbE-yD_8/hqdefault.jpg");
        e3.setDuration("120 minutos");

        Estrenos e4 = new Estrenos();
        e4.setName("nunca digas su nombre");
        e4.setDate("mayo de 2017");
        e4.setImage("http://newcinema.es/imagenes/2016/09/nunca-digas-su-nombre-cartel.jpg");
        e4.setDuration("140 minutos");

        Estrenos e5 = new Estrenos();
        //e5.setName((.getString(R.string.pitufos));
        e5.setName("Los pitufos");
        e5.setDate("mayo de 2017");
        e5.setImage("https://www.mujeresnegocios.com/wp-content/uploads/2017/04/2017-los-pitufos-la-aldea-escondida.jpg");
        e5.setDuration("130 minutos");

        Estrenos e6 = new Estrenos();
        e6.setName("el cielo espera");
        e6.setDate("mayo de 2017");
        e6.setImage("http://1.bp.blogspot.com/-yMiWlB8zNZ0/VQW9Y3atoFI/AAAAAAAAGPY/XsxltLmkHPs/w1200-h630-p-k-no-nu/el_cielo_espera.jpg");
        e6.setDuration("100 minutos");

        Data.datae.add(e1);
        Data.datae.add(e2);
        Data.datae.add(e3);
        Data.datae.add(e4);
        Data.datae.add(e5);
        Data.datae.add(e6);

        adaptere.notifyDataSetChanged();
    }

    public void goToNext() {
        Intent intent = new Intent(this, TabbedActivity.class);
        startActivity(intent);
    }


    public void goToRegister(){
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_POS, i);
        startActivity(intent);
    }
}
