package com.example.dell.testtrial;

import android.content.Context;
import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.support.test.InstrumentationRegistry.getContext;

public class ProgramAdaptar extends RecyclerView.Adapter<ProgramAdaptar.viewHolder>{


    public Context context;

    private  String[] data;
    public ProgramAdaptar(Context context,String[] data)
    {
        this.data=data;
        this.context=context;


    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View v=inflater.inflate(R.layout.list_item_layout,viewGroup,false);


        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, final int i) {
        final String title=data[i];
        viewHolder.textdata.setText(title);

        viewHolder.textdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Clicked "+title,Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {


        ImageView imgicon;
        TextView textdata;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imgicon=itemView.findViewById(R.id.recimg1);
            textdata=itemView.findViewById(R.id.rectext1);




        }
    }

    }



