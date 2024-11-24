package com.example.healthinsights.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthinsights.R;

import java.util.List;

public class ButtonAdapter extends RecyclerView.Adapter<ButtonAdapter.ButtonViewHolder> {

    private List<String> buttonTexts;

    public ButtonAdapter(List<String> buttonTexts) {
        this.buttonTexts = buttonTexts;
    }

    @NonNull
    @Override
    public ButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_button, parent, false);
        return new ButtonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonViewHolder holder, int position) {
        holder.button.setText(buttonTexts.get(position));
    }

    @Override
    public int getItemCount() {
        return buttonTexts.size();
    }

    static class ButtonViewHolder extends RecyclerView.ViewHolder {
        Button button;

        ButtonViewHolder(@NonNull View itemView) {
            super(itemView);
            button = (Button) itemView;
        }
    }
}