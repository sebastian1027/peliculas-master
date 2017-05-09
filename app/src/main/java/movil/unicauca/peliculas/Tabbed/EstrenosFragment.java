package movil.unicauca.peliculas.Tabbed;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import movil.unicauca.peliculas.R;
import movil.unicauca.peliculas.adapters.EstrenoAdapter;
import movil.unicauca.peliculas.adapters.ProximoEstrenoAdapter;
import movil.unicauca.peliculas.databinding.ActivityMoviesBinding;
import movil.unicauca.peliculas.util.Data;

public class EstrenosFragment extends Fragment implements EstrenoAdapter.OnEstrenoSelected {

    ActivityMoviesBinding binding;
    EstrenoAdapter adapter;



    public EstrenosFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.fragment_estrenos);
        adapter = new EstrenoAdapter(getLayoutInflater(), Data.getData(), this);
        binding.list.setAdapter(adapter);
        binding.list.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_estrenos, container, false);
    }

    @Override
    public void onEstreno(int position) {

    }
}
