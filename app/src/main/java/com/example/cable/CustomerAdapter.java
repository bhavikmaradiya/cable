package com.example.cable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {

  private CustomerAdapter[] list;

    public CustomerAdapter(CustomerAdapter[] list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View list=layoutInflater.inflate(R.layout.customer_item,parent,false);
        return new ViewHolder(list);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.tvsubscribername.setText(list[position]);
//        holder.tvmobileno.setText(list[position]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvsubscribername,tvmobileno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvsubscribername=itemView.findViewById(R.id.tvsubscribername);
            this.tvmobileno=itemView.findViewById(R.id.tvmobileno);



        }
    }
}
