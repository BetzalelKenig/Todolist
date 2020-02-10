package com.BetzalelKenig;

import androidx.fragment.app.Fragment;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TodoItem {
    private String mShortDescription;
    private String  deadline;

    public TodoItem(String mShortDescription, String  deadline) {
        this.mShortDescription = mShortDescription;
        this.deadline = deadline;
    }

    public String getmShortDescription() {
        return mShortDescription;
    }

    public String  getDeadline() {
        return deadline;
    }
}
