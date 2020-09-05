package fr.ay.jsontest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MovieInfoAdapter extends BaseAdapter {

    private Context context;
    private List<MovieInfo> movieInfoList;
    private LayoutInflater inflater;


    public MovieInfoAdapter(Context context, List<MovieInfo> movieInfoList)
    {
        this.context = context;
        this.movieInfoList = movieInfoList;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return movieInfoList.size();
    }

    @Override
    public MovieInfo getItem(int i) {
        return movieInfoList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.adapter_info, null);

        //recup infos de l'objet en question

        MovieInfo currentInfo = getItem(i);
        String movieTitle = currentInfo.getTitle();
        String movieSyn = currentInfo.getSyn();
        String movieDate = currentInfo.getDate();

        TextView title = view.findViewById(R.id.title);
        title.setText(movieTitle);

        TextView syn = view.findViewById(R.id.syn);
        syn.setText(movieSyn);

        TextView date = view.findViewById(R.id.date);
        date.setText(movieDate);





        return view;
    }
}
