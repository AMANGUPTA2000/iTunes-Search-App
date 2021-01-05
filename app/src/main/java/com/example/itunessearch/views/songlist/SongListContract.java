package com.example.itunessearch.views.songlist;


import com.example.itunessearch.api.model.Track;

import java.util.List;
/**
 * Created by Aman Gupta on 05,January,2021
 * Email: aman.180410116028@gmail.com
 **/
class SongListContract {

    interface View {
        void displayMessage(String message);

        void setLoadingIndicator(boolean isLoading);

        void displayTracks(List<Track> dataTracks);
    }

    interface Presenter {
        void getTracks(String term);
    }
}