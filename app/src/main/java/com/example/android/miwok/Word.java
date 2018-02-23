package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Mazen on 2/18/2018.
 */
public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    //Class constructor for Words items that don't have images, mImageResourceId stays at its
    // default value -1
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //Class constructor for Words items that have images
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }
    public int getImageResourceId () {
        return mImageResourceId;
    }
    public int getAudioResourceId () {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
