package com.weijie.setsail4dream.presenter;

import com.weijie.setsail4dream.bean.Location;
import com.weijie.setsail4dream.modle.ILocationModle;
import com.weijie.setsail4dream.modle.LocationModle;
import com.weijie.setsail4dream.view.UserView;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by webdev on 2016/1/28.
 */
public class UserPresenter {

    private UserView userView;
    private ILocationModle modle;

    public UserPresenter(UserView userView) {
        this.userView = userView;
        modle = new LocationModle();
    }

    public void getData(String longitude, String latitude) {

        userView.showProgress();

        Observable<Location> observable = modle.getData(longitude,latitude);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Location>() {
                    @Override
                    public void onCompleted() {
                        userView.hideProgress();
                    }
                    @Override
                    public void onError(Throwable e) {
                        userView.hideProgress();
                        userView.showMsg(e.getMessage());
                    }
                    @Override
                    public void onNext(Location location) {
                        userView.showMsg(location.toString());
                    }
                });
    }

}
