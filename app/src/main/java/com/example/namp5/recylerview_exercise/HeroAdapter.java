package com.example.namp5.recylerview_exercise;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by namp5 on 11/20/2018.
 */

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder>{
    private List<Hero> mheroes;

    public HeroAdapter(List<Hero> mheroes) {
        this.mheroes = mheroes;
    }

    @Override
    public HeroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view  = inflater
                .inflate(R.layout.item_hero,parent,false);
        return new HeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HeroViewHolder holder, int position) {
        holder.bindData(mheroes.get(position));
    }

    @Override
    public int getItemCount() {
        return mheroes.size();
    }

    public class HeroViewHolder extends RecyclerView.ViewHolder {
        private TextView mNameHero;
        private ImageView mImageHero;

        public HeroViewHolder(View itemView) {
            super(itemView);
            mNameHero = itemView.findViewById(R.id.text_namehero);
            mImageHero = itemView.findViewById(R.id.imageview_hero);
        }

        private void loadImage (Hero hero) {
            Picasso.with(itemView.getContext())
                    .load(hero.getmUrlImage())
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(mImageHero);
        }
        public void bindData(Hero hero){
            mNameHero.setText(hero.getmNameHero());
            loadImage(hero);
        }
    }
}
