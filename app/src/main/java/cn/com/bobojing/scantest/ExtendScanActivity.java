package cn.com.bobojing.scantest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.zxing.client.android.CaptureActivity;
import java.util.HashSet;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Author: Leo
 * Time: 2017/11/8 15:28.
 * Email: fanrunqi@qq.com
 */
public class ExtendScanActivity extends CaptureActivity {

    @BindView(R.id.goodIcon)
    ImageView goodIcon;
    @BindView(R.id.tv_num)
    TextView tvNum;
    @BindView(R.id.ll_tool)
    RelativeLayout llTool;
    HashSet hs;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend_scan);
        ButterKnife.bind(this);
        InitView();
    }
    private void InitView() {
        llTool.getBackground().setAlpha(100);
        hs = new HashSet();
    }
    /**
     * Author: Leo
     * description: 返回扫描结果
     */
    @Override
    public void handleScanDecode(String result) {
        hs.add(result);
        Toast.makeText(this,result, Toast.LENGTH_SHORT).show();
        tvNum.setText("已扫描 " + hs.size() + " 件");
    }

    @OnClick({R.id.goBack, R.id.ll_tool})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.goBack:
                finish();
                break;
            case R.id.ll_tool:
                Intent i = new Intent(this,ResultActivity.class);
                i.putExtra("data",hs);
                startActivity(i);
                overridePendingTransition(0, 0);
                break;
        }
    }
}
