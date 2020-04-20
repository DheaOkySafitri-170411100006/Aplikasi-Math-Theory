package projectppb.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapterDetail extends RecyclerView.Adapter<RecyclerViewAdapterDetail.ViewHolder>{

    private ArrayList <String> judulmateri2 = new ArrayList<>();
    private ArrayList<String> topik2 = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapterDetail(ArrayList<String> judulmateri2, ArrayList<String> topik2, Context context) {
        this.judulmateri2 = judulmateri2;
        this.topik2 = topik2;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter_detail, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textViewjudulmateri2.setText(judulmateri2.get(position));
        holder.textViewtopik2.setText(topik2.get(position));

    }

    @Override
    public int getItemCount() {
        return judulmateri2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewjudulmateri2 ;
        TextView textViewtopik2;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewjudulmateri2 = itemView.findViewById(R.id.textViewjudulmateri2);
            textViewtopik2 = itemView.findViewById(R.id.textViewtopik2);
        }
    }
}
