package com.example.youtubelistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity implements itemClickedListner{
        private RecyclerView recyclerView;
        private ArrayList<view> studentList=new ArrayList<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                initView();
                buildsetData();
                setRecyclerView();
        }private void setRecyclerView(){
                Adapter studentAdapter=new Adapter(studentList,this);
                LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(studentAdapter);
        }
        private  void initView(){
                recyclerView=findViewById(R.id.recycleView);
        }
        private void buildsetData(){
                view student1=new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student1);
                view student2=new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
               studentList.add(student2);
                view student3 =new view("https://www.youtube.com/watch?v=krBXdItE5m0");
                studentList.add(student3);
                view student4=new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student4);
                view student5 =new view("https://www.youtube.com/watch?v=krBXdItE5m0");
                studentList.add(student5);
                view student6=new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student6);
                view student7 =new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student7);
                view student8=new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student8);
                view student9 =new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student9);
                view student10=new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student10);
                view student11 =new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student11);
                view student12=new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student12);
                view student13=new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student13);
                view student14 =new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student14);
                view student15=new view("https://www.youtube.com/watch?v=rqQGp0l30lI");
                studentList.add(student15);
        }

        @Override
        public void onItemClicked(view model, int position) {
                /*Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(model.getName()));
                startActivity(intent);*/
                  Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(
                        (model.getName())));
                startActivity(intent);

        }
}