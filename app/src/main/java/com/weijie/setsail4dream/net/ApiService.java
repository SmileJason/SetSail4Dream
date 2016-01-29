package com.weijie.setsail4dream.net;


import com.weijie.setsail4dream.bean.Location;
import com.weijie.setsail4dream.bean.User;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by webdev on 2016/1/28.
 */
public interface ApiService {

    @GET("service/getIpInfo.php")
    Observable<User> getData(@Query("ip") String ip);

    @GET("service/regeo")
    Observable<Location> getLocations(@Query("longitude") String longitude,@Query("latitude") String latitude);

}

