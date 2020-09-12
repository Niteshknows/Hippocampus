package com.example.diyprojects;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static com.example.diyprojects.R.layout.item_cardview;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyHolder> {
    private Context mContext;
    private List<Projects> mData;

    public HomeAdapter(Context mContext,List<Projects> mData) {
        this.mContext=mContext;
        this.mData=mData;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflator= LayoutInflater.from(mContext);
        view = mInflator.inflate(R.layout.item_cardview,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, final int position) {
        holder.projectTitle.setText(mData.get(position).getProjName());
        holder.projectImage.setImageResource(mData.get(position).getThumbnail());

        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,ProjectActivity.class);
                intent.putExtra("projects", mData.get(position));
                intent.putExtra("Name", mData.get(position).getProjName());
                intent.putExtra("Materials",mData.get(position).getMaterialsList());
                intent.putExtra("steps",mData.get(position).getStepsList());
                mContext.startActivity(intent);

            }
        });
    }
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
       TextView projectTitle;
       ImageView projectImage;
       CardView cardview;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            projectImage=itemView.findViewById(R.id.ImageHome);
            projectTitle=itemView.findViewById(R.id.projNameHome);
            cardview=itemView.findViewById(R.id.cardviewHome);

        }
    }

}
