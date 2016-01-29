package com.weijie.setsail4dream.modle;

import com.weijie.setsail4dream.bean.Location;

import rx.Observable;

/**
 * Created by webdev on 2016/1/28.
 */
public interface ILocationModle {

    public Observable<Location> getData(String longitude, String latitude);

}
