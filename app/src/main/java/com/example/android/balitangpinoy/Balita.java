package com.example.android.balitangpinoy;

public class Balita {
    private String mTitle;
    private String mDate;
    private String mSectionName;

    public Balita(String title, String date, String sectionName){
        mTitle = title;
        mDate = date;
        mSectionName = sectionName;
    }

    public String getTitle(){
        return mTitle;
    }
    public String getDate(){
        return mDate;
    }
    public String getSectionName() {
        return mSectionName;
    }
}
