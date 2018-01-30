package edu.duke.compsci290.albumviewer;

/**
 * Created by sramprasad on 1/25/2018.
 */
import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.widget.*;
import android.graphics.drawable.Drawable;
import android.content.Context;



public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewHolder>{
    final Context mContext;
    String[] mAlbums;
    String [] mArtists;

    public class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout mLinearLayout;
        ImageView mImageView;
        TextView mAlbumName;
        TextView mArtist;
        public ViewHolder(View itemView) {
            super(itemView);
            this.mLinearLayout = itemView.findViewById(R.id.album_holder_linear_layout);
            this.mImageView = itemView.findViewById(R.id.album_artwork_image_view);
            this.mAlbumName = itemView.findViewById(R.id.album_name_text_view);
            this.mArtist = itemView.findViewById(R.id.artist_name_text_view);
        }
    }

    public AlbumAdapter(final Context context, String[] albums, String[] artists){
        mContext = context;
        mAlbums = albums;
        mArtists = artists;

    }
    @Override
    public int getItemCount(){
        return mAlbums.length;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //obtains an instance of the layout inflater, which instantiates album_holder
        View row = mInflater.inflate(R.layout.album_holder, parent, false);
        final ViewHolder albumHolder = new ViewHolder(row);
        return albumHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        String albumName = mAlbums[position].toLowerCase().replaceAll("\\W+", "");
        int drawableId = mContext.getResources().getIdentifier(albumName, "drawable", mContext.getPackageName());

        Drawable albumArtwork = mContext.getDrawable(drawableId);
        holder.mImageView.setImageDrawable(albumArtwork);
        holder.mAlbumName.setText(mAlbums[position]);
        holder.mArtist.setText(mArtists[position]);
    }




}
