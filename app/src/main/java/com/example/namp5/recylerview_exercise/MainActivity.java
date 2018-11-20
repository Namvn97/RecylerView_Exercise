package com.example.namp5.recylerview_exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private HeroAdapter mHeroAdapter;
    private List<Hero> mHeroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_Hero);
        mHeroes = new ArrayList<>();
        Hero hero1 = new Hero("Ironman",R.drawable.ironman);
        mHeroes.add(hero1);
        Hero hero2 = new Hero("Wonderwoman",R.drawable.wonderwoman);
        mHeroes.add(hero2);
        Hero hero3 = new Hero("Wolverinefull",R.drawable.wolverinefull);
        mHeroes.add(hero3);

        mHeroAdapter = new HeroAdapter(mHeroes);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mHeroAdapter);
    }
}
