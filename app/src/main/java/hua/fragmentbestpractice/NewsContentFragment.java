package hua.fragmentbestpractice;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by caihua2300 on 02/09/2016.
 */
public class NewsContentFragment extends android.support.v4.app.Fragment {
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.news_content_frag,container,false);

        News news=(News) getArguments().getSerializable("news");
        View view1=view.findViewById(R.id.visibility_layout);
        view1.setVisibility(View.VISIBLE);
        TextView newsTitleText = (TextView) view.findViewById (R.id.news_title);
        TextView newsContentText = (TextView) view.findViewById(R.id.news_content);
        newsTitleText.setText(news.getTitle());
        newsContentText.setText(news.getContent());

        return view;
    }




}
