package com.example.itunessearch.views.songdetail;

import com.example.itunessearch.api.model.Track;
/**
 * Created by Aman Gupta on 05,January,2021
 * Email: aman.180410116028@gmail.com
 **/
public class SongDetailContract {

    interface View {
        void displayMessage(String message);

        void displayTrack(Track track);
    }
}
