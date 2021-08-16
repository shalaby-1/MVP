package com.example.mvp.ui;

import com.example.mvp.pojo.MoiveModel;

/**
 * bring data from model
 * send data to interface
 */
public class MoivePresenter {

    MoiveView view;

    public MoivePresenter(MoiveView view) {
        this.view = view;
    }

    // get data from database to presenter
    public MoiveModel getMovieFromDatabase() {
        return new MoiveModel("hollow man", "a horror moive", "horror", 9.5);
    }

    // send data from presenter to interface
    // gets called form view to get data
    // notifiy interface that the data is ready and send it to view
    public void getMoiveName(){
        view.onGetMoiveName(getMovieFromDatabase().getName());
    }

}
