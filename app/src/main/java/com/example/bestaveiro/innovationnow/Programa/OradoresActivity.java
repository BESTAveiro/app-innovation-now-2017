package com.example.bestaveiro.innovationnow.Programa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.example.bestaveiro.innovationnow.R;
import com.example.bestaveiro.innovationnow.SpeakerInfo;

public class OradoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.oradores);


        ListView list=(ListView) findViewById(R.id.ListViewOradores);
        list.setAdapter(new ListViewAdapter());
        list.setDivider(null);


        Typeface tf= Typeface.createFromAsset(getAssets(),"fonts/AleoRegular.otf");
        TextView tv=(TextView) findViewById(R.id.SpeakersTitleFont);
        tv.setTypeface(tf);

    }

    class ListViewAdapter extends BaseAdapter {
        Typeface tf= Typeface.createFromAsset(getAssets(),"fonts/AleoRegular.otf");
        String[] names;
        String[] titles;
        String[] description;
        int[] imgs={R.drawable.foto_2,R.drawable.foto_1,R.drawable.foto_3,R.drawable.foto_4,R.drawable.pedro_madureira,R.drawable.carlos_martins,
                };

        public ListViewAdapter(){

            names=getResources().getStringArray(R.array.nomesOradores);
            titles=getResources().getStringArray(R.array.titulosOradores);
            description=getResources().getStringArray(R.array.descricaoOradores);

        }

        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(final int position, View view, ViewGroup viewGroup) {
            View v=view;

            if(v==null){
                LayoutInflater vi;
                vi=LayoutInflater.from(getBaseContext());
                v=vi.inflate(R.layout.list_view_oradores,null);
            }
            Typeface tf= Typeface.createFromAsset(getAssets(),"fonts/AleoRegular.otf");
            ((TextView) v.findViewById(R.id.nomeOrador)).setText(names[position]);
            ((TextView) v.findViewById(R.id.nomeOrador)).setTypeface(tf);
            ((TextView) v.findViewById(R.id.apresentacaoOrador)).setText(titles[position]);
            ((TextView) v.findViewById(R.id.apresentacaoOrador)).setTypeface(tf);
            ((ImageButton) v.findViewById(R.id.fotoOrador)).setBackgroundResource(imgs[position]);
            ((ImageButton) v.findViewById(R.id.fotoOrador)).setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent tmp=new Intent(OradoresActivity.this, SpeakerInfo.class);
                    tmp.putExtra("position",position);
                    startActivity(tmp);
                }
            });
            return v;
        }
    }


}
