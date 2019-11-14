package com.example.redditapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Create our adapter with the list of data from ModelReddit as a parameter. An adapter contains the list of users
class RecyclerViewAdapter(
    val redditData: ArrayList<ModelReddit>,
    val onRedditPostClicked: OnredditPostClicked
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount() = redditData.size

    // onBindViewHolder is called as your views are populated during scrolling.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(redditData[position])
        holder.tv_headline.setOnClickListener {
            onRedditPostClicked.onRedditClicked(redditData[position])
        }

    }

    //Get a reference to our views from card_view xml layout
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tv_votes = itemView.findViewById<TextView>(R.id.tv_votes)
        val tv_posted_by = itemView.findViewById<TextView>(R.id.tv_posted_by)
        val tv_headline = itemView.findViewById<TextView>(R.id.tv_headline)
        val tv_headline_summary = itemView.findViewById<TextView>(R.id.tv_headline_summary)
        val tv_comment = itemView.findViewById<TextView>(R.id.tv_comment)
        val tv_sub_reddit = itemView.findViewById<TextView>(R.id.tv_sub_reddit)


        fun bind(modelReddit: ModelReddit) {

            tv_votes.text = modelReddit.rating
            tv_posted_by.text = modelReddit.postedBy
            tv_headline.text = modelReddit.headLine
            tv_headline_summary.text = modelReddit.headLineSummary
            tv_comment.text = modelReddit.numComments
            tv_sub_reddit.text = modelReddit.subReddit

        }
    }


}

interface OnredditPostClicked {
    fun onRedditClicked(reddit: ModelReddit)
}














