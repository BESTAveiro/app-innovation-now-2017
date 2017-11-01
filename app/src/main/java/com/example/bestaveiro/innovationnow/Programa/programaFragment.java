package com.example.bestaveiro.innovationnow.Programa;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.bestaveiro.innovationnow.R;

import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * A simple {@link Fragment} subclass.
 */
public class programaFragment extends Fragment
{

    int dia;

    public static programaFragment createProgramaFragment (int dia)
    {
        programaFragment tmp = new programaFragment();
        Bundle args = new Bundle();
        args.putInt("dia", dia);
        tmp.setArguments(args);

        return tmp;
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View myView = inflater.inflate(R.layout.fragment_programa, container, false);

        dia = getArguments().getInt("dia");

        int drawable;

        switch(dia)
        {
            case 2:
                drawable = getResources().getIdentifier("programa_dia2", "drawable", getActivity().getPackageName());
                break;
            case 3:
                drawable = getResources().getIdentifier("programa_dia3", "drawable", getActivity().getPackageName());
                break;
            default: // deu merda
                drawable = getResources().getIdentifier("programa_dia2", "drawable", getActivity().getPackageName());
                break;
        }

        //((ImageView)myView.findViewById(R.id.programa)).setImageDrawable(drawable);
        Glide.with(getContext()).load(drawable).into((ImageView)myView.findViewById(R.id.programa));
        PhotoViewAttacher mAttacher = new PhotoViewAttacher((ImageView)myView.findViewById(R.id.programa));

        return myView;
    }

}
