package com.force.codes.kotlinreyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(
        inflater.inflate(R.layout.list_item, parent, false)
    ) {

    private var textTitle: TextView? = null
    private var yearView: TextView? = null

    init {
        textTitle = itemView.findViewById(R.id.list_title)
        yearView = itemView.findViewById(R.id.list_description)
    }

    fun bind(movie: Movie) {
        textTitle?.text = movie.title
        yearView?.text = movie.year.toString()
    }
}