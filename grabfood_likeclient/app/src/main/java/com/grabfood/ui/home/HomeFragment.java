package com.grabfood.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.grabfood.R;
import com.grabfood.adapters.HomeHorAdapter;
import com.grabfood.adapters.HomeVerAdapter;
import com.grabfood.models.HomeHorModel;
import com.grabfood.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    RecyclerView homeHorizontalRec,homeVerticalRec;
    List<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    ////////////////////////////////////Vertical
    List<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home,container,false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        //////////////////////////Horizontal RecyclerView
        homeHorModelList = new ArrayList<>();
        homeHorModelList.add(new HomeHorModel(R.drawable.pho,"Noodles"));
        homeHorModelList.add(new HomeHorModel(R.drawable.banhmi,"Bread"));
        homeHorModelList.add(new HomeHorModel(R.drawable.com,"Rice"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fastfood,"Fast Food"));
        homeHorModelList.add(new HomeHorModel(R.drawable.drinks,"Drinks"));

        homeHorAdapter = new HomeHorAdapter(getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        //////////////////////////Vertical RecyclerView
        homeVerModelList = new ArrayList<>();

        homeVerModelList.add(new HomeVerModel(R.drawable.bundaumet,"Bún Đậu Ba Anh Em","10:10-24:00","2.9","sdasd"));
        homeVerModelList.add(new HomeVerModel(R.drawable.buncha,"Bún Chả Obama","10:10-23:00","4.9","Min - $4"));
        homeVerModelList.add(new HomeVerModel(R.drawable.trasua,"Trà Sữa YO TEA","10:10-23:00","4.9","Min - $34"));

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);


        return root;
    }
}