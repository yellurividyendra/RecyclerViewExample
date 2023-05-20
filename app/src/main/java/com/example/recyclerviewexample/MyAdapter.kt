package com.example.recyclerviewexample

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs : List<Song>) : RecyclerView.Adapter<MyAdapter.MyviewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
    val inflater : LayoutInflater = LayoutInflater.from(parent.context)
     val view=inflater.inflate(R.layout.item_view,parent,false)
        return MyviewHolder(view)
    }

    override fun getItemCount(): Int {
       return songs.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
      holder.txtTitle.text = songs[position].title
      holder.txtDescription.text = songs[position].description
        var color = "#CCCCCC"
        if(position % 2 == 0 ){
            color = "#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))
    }

    class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        var txtDescription = itemView.findViewById<TextView>(R.id.txtDescription)
        var container = itemView.findViewById<LinearLayout>(R.id.container)
}

}