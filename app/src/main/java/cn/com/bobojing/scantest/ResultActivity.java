package cn.com.bobojing.scantest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {
    HashSet hs;
    @BindView(R.id.listview)
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        hs = (HashSet) getIntent().getExtras().getSerializable("data");
        Iterator it=hs.iterator();
        List<Map<String, Object>> listems = new ArrayList<Map<String, Object>>();
        while(it.hasNext())
        {
            Map<String, Object> listem = new HashMap<String, Object>();
            listem.put("name",it.next().toString());
            listems.add(listem);
        }
        SimpleAdapter simplead = new SimpleAdapter(this,listems,
                R.layout.item, new String[] { "name" },
                new int[] {R.id.tv_name});
        listview.setAdapter(simplead);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }
}
