package com.example.cable;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SubscriberListAdapter extends RecyclerView.Adapter<SubscriberListAdapter.ViewHolder> {

    private Context context;

    public SubscriberListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View list = layoutInflater.inflate(R.layout.item_subscriber, parent, false);
        return new ViewHolder(list);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.tvsubscribername.setText(list[position]);
//        holder.tvmobileno.setText(list[position]);

        holder.itemView.setOnClickListener(view -> context.startActivity(new Intent(context, SubscriberDetailsActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)));

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvsubscribername, tvmobileno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvsubscribername = itemView.findViewById(R.id.tvsubscribername);
            this.tvmobileno = itemView.findViewById(R.id.tvmobileno);


        }
    }
}
