package com.example.jokesusingjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JokeAdapter extends RecyclerView.Adapter<JokeAdapter.ViewHolder> {

    private List<Joke> jokes;
    Context context;

    public JokeAdapter(List<Joke> jokes,Context context) {
        this.jokes = jokes;
        this.context = context;
    }

    @NonNull
    @Override
    public JokeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull JokeAdapter.ViewHolder holder, int position) {


        holder.setup.setText(jokes.get(position).getSetup());
        holder.punchline.setText(jokes.get(position).getPunchline());


    }

    @Override
    public int getItemCount() {
        return jokes.size();
    }


    public static class ViewHolder extends  RecyclerView.ViewHolder{

        TextView setup,punchline;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            setup = itemView.findViewById(R.id.setup);
            punchline = itemView.findViewById(R.id.punchline);
        }
    }
}
