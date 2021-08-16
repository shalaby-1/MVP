package com.example.mvp.ui;
// Database / Model --> presenter --> interface --> view
public interface MoiveView {
    /**
     * gets data from presenter
     * send data to view
     * @param moiveName
     */
    void onGetMoiveName(String moiveName);
}
