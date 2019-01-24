package org.pursuit.unit_03_assessment.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.pursuit.unit_03_assessment.DisplayActivity;
import org.pursuit.unit_03_assessment.model.Planet;

public class ViewHolderClass extends RecyclerView.ViewHolder {


    private TextView planet_name;
    private TextView planet_number;
    private ImageView planet_image;
    Intent intent;

    public ViewHolderClass(@NonNull View itemView) {
        super(itemView);
//        planet_name = itemView.findViewById(R.id.planet_id_name);
    }



    public void onBind(final Planet planet){
//        planet_name.setText(planet.getName());
//
//        itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                intent = new Intent(itemView.getContext(),DisplayActivity.class);
//                intent.putExtra("name",planet.getName());
//                intent.putExtra("number",planet.getNumber());
//                intent.putExtra("image",planet.getImage());
//                itemView.getContext().startActivity(intent);
//            }
//        });
    }

}
