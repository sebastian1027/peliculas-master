package movil.unicauca.peliculas.Tabbed;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import movil.unicauca.peliculas.adapters.ProximoEstrenoAdapter;
import movil.unicauca.peliculas.databinding.ActivityMoviesBinding;

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


    }

    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(this, R.layout.fragment_proximos_estrenos, container, false);
        adapter1 = new ProximoEstrenoAdapter(getLayoutInflater(null), Datape.getDatape(), this);
        binding.list.setAdapter(adapter1);
        binding.list.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }*/

    @Override
    public void onProxEstreno(int position) {

    }
}
