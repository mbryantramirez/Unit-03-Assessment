package org.pursuit.unit_03_assessment.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.unit_03_assessment.model.Planet;
import org.pursuit.unit_03_assessment.view.ViewHolderClass;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<ViewHolderClass> {
    List<Planet> planetList;

    public AdapterClass (List<Planet> planetList){
        this.planetList=planetList;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_display,viewGroup,false);
        return new ViewHolderClass(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.onBind(planetList.get(i));
    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }
}
