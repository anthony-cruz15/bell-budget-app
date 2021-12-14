package com.example.bellbudgetapp;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

;
import com.example.bellbudgetapp.databinding.FragmentItemListBinding;

import java.text.BreakIterator;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link }.
 */
public class ItemRecyclerViewAdapter extends RecyclerView.Adapter<ItemRecyclerViewAdapter.ViewHolder> {

    private final List<Item> items;

    public ItemRecyclerViewAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.item = items.get(position);
        holder.itemNameView.setText(holder.item.getName());
        holder.itemQuantityView.setText(holder.item.getQuantity().toString());
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                items.remove(holder.item);
                notifyItemRemoved(holder.getLayoutPosition());
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView itemNameView;
        public final TextView itemQuantityView;
        public Item item;

        public ViewHolder(FragmentItemListBinding binding) {
            super(binding.getRoot());
            itemNameView = binding.itemNameTextView;
            itemQuantityView = binding.itemQuantityTextView;
        }

        @Override
        public String toString() {
            BreakIterator mContentView = null;
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}