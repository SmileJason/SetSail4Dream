package com.weijie.setsail4dream.modle;

import com.weijie.setsail4dream.activity.MainActivity;
import com.weijie.setsail4dream.bean.Location;
import com.weijie.setsail4dream.net.ApiService;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * Created by webdev on 2016/1/28.
 */
public class LocationModle implements  ILocationModle {

    @Override
    public Observable<Location> getData(final String longitude, final String latitude) {
        return Observable.create(new Observable.OnSubscribe<Location>() {
            @Override
            public void call(Subscriber<? super Location> subscriber) {

                /*Retrofit retrofit = new Retrofit.Builder().baseUrl(MainActivity.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .build();
                ApiService service = retrofit.create(ApiService.class);
                Observable<Location> observable = service.getLocations(longitude,latitude);*/

                /*if (user == null) {
                    subscriber.onError(new Exception("Location = null"));
                } else {
                    subscriber.onNext(location);
                    subscriber.onCompleted();
                }*/
            }
        });

    }

}
