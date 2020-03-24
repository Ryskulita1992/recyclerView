package kg.geektech.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MainViewHolder extends RecyclerView.ViewHolder{
    TextView firsIstName, secondIsSurname,thirdIsDOBirth;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        firsIstName=itemView.findViewById(R.id.view_name);
        secondIsSurname=itemView.findViewById(R.id.view_surname);
        thirdIsDOBirth=itemView.findViewById(R.id.view_date_of_birth);
    }

}
