package kg.geektech.recyclerview;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MainViewHolder extends RecyclerView.ViewHolder{
    TextView firstLine, secondLine,thirdLine;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        firstLine=itemView.findViewById(R.id.view_name);
        secondLine=itemView.findViewById(R.id.view_surname);
        thirdLine=itemView.findViewById(R.id.view_date_of_birth);
        Log.d("View Holder", "");





    }

}
