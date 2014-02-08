package com.salvadordalvik.something.list;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.salvadordalvik.fastlibrary.list.BaseFastItem;
import com.salvadordalvik.something.R;

/**
 * Created by matthewshepard on 2/7/14.
 */
public class PrivateMessageItem extends BaseFastItem<PrivateMessageItem.PMHolder> {
    private final String title, author, date;

    public PrivateMessageItem(int id, String title, String author, String date) {
        super(R.layout.private_message_item, id);
        this.title = title;
        this.author = author;
        this.date = date;
    }

    @Override
    public PMHolder createViewHolder(View view) {
        return new PMHolder(view);
    }

    @Override
    public void updateViewFromHolder(View view, PMHolder holder) {
        holder.title.setText(title);
    }

    @Override
    public boolean onItemClick(Activity act, Fragment fragment) {
        Toast.makeText(act, "PM: "+getId(), Toast.LENGTH_SHORT).show();
        return false;
    }

    protected static class PMHolder{
        private TextView title;

        public PMHolder(View view) {
            title = (TextView) view.findViewById(R.id.pm_item_title);
        }
    }
}