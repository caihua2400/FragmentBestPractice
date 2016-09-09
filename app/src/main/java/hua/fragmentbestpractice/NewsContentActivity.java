package hua.fragmentbestpractice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.support.v4.app.Fragment;

/**
 * Created by caihua2300 on 02/09/2016.
 */
public class NewsContentActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.news_content);
        News news=(News) getIntent().getSerializableExtra("news");
        Bundle bundle=new Bundle();
        bundle.putSerializable("news",news);
        NewsContentFragment newsContentFragment=new NewsContentFragment();
        newsContentFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.news_content_layout,newsContentFragment).commit();

        //NewsContentFragment newsContentFragment=(NewsContentFragment) getSupportFragmentManager().findFragmentById(R.id.news_content_fragment);
        //newsContentFragment.refresh(newsTitle, newsContent);

    }
}
