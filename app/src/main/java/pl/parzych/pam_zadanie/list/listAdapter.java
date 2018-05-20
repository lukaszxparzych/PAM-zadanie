package pl.parzych.pam_zadanie.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pl.parzych.pam_zadanie.R;

public class listAdapter extends RecyclerView.Adapter<listAdapter.ViewHolder> {

    private List<list> lista;

    public listAdapter(List<list> lista) {this.lista = lista;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View rowView = inflater.inflate(R.layout.list,parent,false);

        ViewHolder viewHolder = new ViewHolder(rowView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.leftText.setText(lista.get(position).getLeftText());
        holder.rightText.setText(lista.get(position).getRightText());

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView leftText;
        public TextView rightText;

        public ViewHolder(View itemView) {
            super(itemView);

            leftText = itemView.findViewById(R.id.left_text);
            rightText = itemView.findViewById(R.id.right_text);
        }
    }
}
