package projectppb.com;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> logomateri = new ArrayList<>();
    private ArrayList<String> judulmateri = new ArrayList<>();
    private ArrayList<String> topik = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> logomateri, ArrayList<String> judulmateri, ArrayList<String> topik, Context context) {
        this.logomateri = logomateri;
        this.judulmateri = judulmateri;
        this.topik = topik;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }


    // terdapat method click listener
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(logomateri.get(position)).into(holder.imageViewlogomateri);

        holder.textViewjudulmateri.setText(judulmateri.get(position));
        holder.textViewtopik.setText(topik.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return judulmateri.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imageViewlogomateri;
        TextView textViewjudulmateri;
        TextView textViewtopik;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewlogomateri = itemView.findViewById(R.id.imageViewlogomateri);
            textViewjudulmateri = itemView.findViewById(R.id.textViewjudulmateri);
            textViewtopik = itemView.findViewById(R.id.textViewtopik);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
