package com.shubhamdeshmukh.hackethonproblem;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link user_show_all_products#newInstance} factory method to
 * create an instance of this fragment.
 */
public class user_show_all_products extends Fragment {


    ImageView prod_img;
    TextView prod_name, prod_price;
    Button order_btn;




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public user_show_all_products() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment user_show_all_products.
     */
    // TODO: Rename and change types and number of parameters
    public static user_show_all_products newInstance(String param1, String param2) {
        user_show_all_products fragment = new user_show_all_products();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_user_show_all_products, container, false);

        prod_img = view.findViewById(R.id.usr_prod_img);
        prod_name = view.findViewById(R.id.prod_name_id);
        prod_price = view.findViewById(R.id.prod_price_id);
        order_btn = view.findViewById(R.id.place_order_btn);



        return view;
    }
}