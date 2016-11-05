package com.allanralph.multitab_ex_7;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class October extends Fragment {
    View v1;
    ListView lv;
    List<String> allan=new ArrayList<String>();
    Button add,del;
    EditText edit;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v1=inflater.inflate(R.layout.fragment_january,container,false);

        lv=(ListView)v1.findViewById(R.id.lv);
        add=(Button)v1.findViewById(R.id.addi);
        del=(Button)v1.findViewById(R.id.del);
        edit=(EditText)v1.findViewById(R.id.edit);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String abc = edit.getText().toString();
                allan.add(abc);

                ArrayAdapter adapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,allan);
                lv.setAdapter(adapter);
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rem=Integer.parseInt(edit.getText().toString());
                allan.remove(rem-1);
                ArrayAdapter adapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,allan);
                lv.setAdapter(adapter);
            }
        });




        return v1;
    }

}
