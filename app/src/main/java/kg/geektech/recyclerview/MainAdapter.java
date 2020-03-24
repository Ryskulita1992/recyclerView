package kg.geektech.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter<E> extends RecyclerView.Adapter <MainViewHolder> {

    ArrayList<E> name, surname,dateOfBirth;

    public  MainAdapter(){
        name=new ArrayList<>();
        surname=new ArrayList<>();
        dateOfBirth=new ArrayList<>();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//sozdaet main view holder
        LayoutInflater  MainViewHolder=LayoutInflater.from (parent.getContext()); //sozdaet view po cherteju xml
        View v=  MainViewHolder.inflate(R.layout.view_holder_main,parent, false);
        return new MainViewHolder(v);

    }

    @Override
    public void onBindViewHolder//vyzyvaetsya kogda recycler nujno zapolnit dannymi

    (@NonNull MainViewHolder holder, int position) {
        holder.firsIstName.setText(name.get(position).toString());
        holder.secondIsSurname.setText(surname.get(position).toString());
        holder.thirdIsDOBirth.setText((Integer) dateOfBirth.get(position));
    }

    @Override
    public int getItemCount() {//obshee kolvo vseh elementov
        return dateOfBirth.size();
    }
}
