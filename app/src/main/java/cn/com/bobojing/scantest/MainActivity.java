package cn.com.bobojing.scantest;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import kr.co.namee.permissiongen.PermissionFail;
import kr.co.namee.permissiongen.PermissionGen;

/**
 * Author: Leo
 * Time: 2017/11/7 14:18.
 * Email: fanrunqi@qq.com
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        PermissionGen.with(MainActivity.this)
                .addRequestCode(100)
                .permissions(
                        Manifest.permission.CAMERA)
                .request();
    }

    @PermissionFail(requestCode = 100)
    public void doFailSomething() {
        Toast.makeText(this, "未获得相机权限", Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.ActivityScan)
    public void onViewClicked() {
        startActivity(new Intent(this,ExtendScanActivity.class));
    }
}
