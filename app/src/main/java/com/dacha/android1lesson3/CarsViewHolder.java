package com.dacha.android1lesson3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_count;

    public CarsViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_count = itemView.findViewById(R.id.tv_count);
    }
    public void bind(String count){
        tv_count.setText(count);
    }
}
