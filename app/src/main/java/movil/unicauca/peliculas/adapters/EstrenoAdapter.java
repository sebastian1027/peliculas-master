package movil.unicauca.peliculas.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;
import movil.unicauca.peliculas.R;
import movil.unicauca.peliculas.databinding.FragmentEstrenosBinding;
import movil.unicauca.peliculas.databinding.TemplateEstrenosBinding;
import movil.unicauca.peliculas.models.Estrenos;
import movil.unicauca.peliculas.models.ProximosEstrenos;

/**
 * Created by Sebastianl on 03/05/2017.
 */

public class EstrenoAdapter extends RecyclerView.Adapter<EstrenoAdapter.EstrenoHolder> implements BaseAdapter  {
    public EstrenoAdapter(LayoutInflater layoutInflater, List<Estrenos> data) {
    }

    public EstrenoAdapter(LayoutInflater inflater, List<Estrenos> data, OnEstrenoSelected onEstrenoSelected) {
        this.inflater = inflater;
        this.data = data;
        this.onEstrenoSelected = onEstrenoSelected;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TemplateEstrenosBinding binding = TemplateEstrenosBinding.inflate(inflater);
        binding.setEstrenos(data.get(position));
        return binding.getRoot();
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }
    //poner video de databinding2 en 36:00


    //region comentarios
/*
    //region Comentar esto
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
    //endregion
*/
//endregion
    public interface OnEstrenoSelected{
        void onEstreno(int position);
    }
    LayoutInflater inflater;
    List<Estrenos> data;
    OnEstrenoSelected onEstrenoSelected;





    @Override
    public EstrenoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.activity_tabbed, parent, false);
        return new EstrenoHolder(v);
    }

    @Override
    public void onBindViewHolder(EstrenoHolder holder, int position) {
        Estrenos e = data.get(position);
        holder.binding.setEstrenos(e);
        holder.binding.getRoot().setTag(position);
        holder.binding.setHandler(this);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void onClick(View view){
        int pos = (int) view.getTag();
        onEstrenoSelected.onEstreno(pos);
    }

    //region ViewHolder
    static class EstrenoHolder extends RecyclerView.ViewHolder{

        FragmentEstrenosBinding binding;

        public EstrenoHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion
}
