package movil.unicauca.peliculas.Tabbed;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import movil.unicauca.peliculas.R;
import movil.unicauca.peliculas.adapters.ProximoEstrenoAdapter;
import movil.unicauca.peliculas.databinding.ActivityMoviesBinding;
import movil.unicauca.peliculas.util.Datape;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProximosEstrenosFragment extends Fragment implements ProximoEstrenoAdapter.OnProxEstrenoSelected{

    ActivityMoviesBinding binding;
    ProximoEstrenoAdapter adapter1;

    public ProximosEstrenosFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movies);
        adapter1 = new ProximoEstrenoAdapter(getLayoutInflater(), Datape.getDatape(), this);
        binding.list.setAdapter(adapter1);
        binding.list.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_proximos_estrenos, container, false);
    }

    @Override
    public void onProxEstreno(int position) {

    }
}
