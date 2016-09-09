package hua.fragmentbestpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity implements NewsTitleFragment.CallBack{
    private boolean isTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.news_content_layout) != null){
            isTwoPane=true;
        }else{
            isTwoPane = false;
        }
    }

    @Override
    public void OnItemSelected(News news) {
        if(isTwoPane){
            Bundle args=new Bundle();
            args.putSerializable("news",news);
            NewsContentFragment newsContentFragment=new NewsContentFragment();
            newsContentFragment.setArguments(args);
            getSupportFragmentManager().beginTransaction().replace(R.id.news_content_layout,newsContentFragment).commit();
            //newsContentFragment.refresh(news.getTitle(), news.getContent());

        }else{
            //because we are in a one pane mode, we need to turn to the next activity and transfer the content.

            Intent intent = new Intent(this, NewsContentActivity.class);

            intent.putExtra("news",news);

            startActivity(intent);
        }
    }
}
