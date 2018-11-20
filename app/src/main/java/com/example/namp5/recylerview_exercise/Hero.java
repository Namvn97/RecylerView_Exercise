package com.example.namp5.recylerview_exercise;

/**
 * Created by namp5 on 11/20/2018.
 */

public class Hero {
    private String mNameHero ;
    private int mUrlImage ;

    public Hero(){
    }

    public Hero(String mNameHero ,int  mUrlImage){
        this.mNameHero = mNameHero;
        this.mUrlImage = mUrlImage;
    }

    public String getmNameHero() {
        return mNameHero;
    }

    public void setmNameHero(String mNameHero) {
        this.mNameHero = mNameHero;
    }

    public int getmUrlImage() {
        return mUrlImage;
    }

    public void setmUrlImage(int mUrlImage) {
        this.mUrlImage = mUrlImage;
    }
}
