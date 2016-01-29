package com.weijie.setsail4dream.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.weijie.setsail4dream.R;
import com.weijie.setsail4dream.presenter.UserPresenter;
import com.weijie.setsail4dream.view.UserView;

public class MainActivity extends ActionBarActivity implements UserView {

    public static final String BASE_URL = "http://ditu.amap.com/";

    private ProgressDialog dialog;
    private UserPresenter presenter;
    private TextView msgTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new ProgressDialog(this);
        dialog.setMessage("获取数据，请稍等......");
        presenter = new UserPresenter(this);

        msgTv = (TextView) findViewById(R.id.msg);
        findViewById(R.id.getData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //User user = new User("Jason","123456");
                presenter.getData("121.04925573429551","31.315590522490712");
            }
        });
    }

    @Override
    public void showProgress() {
        dialog.show();
    }

    @Override
    public void hideProgress() {
        dialog.hide();
    }

    @Override
    public void showMsg(String msg) {
        msgTv.setText(msg);
    }
}
