package com.assignment.bookstore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecordsFragment extends Fragment {
    RecyclerView recyclerView;
    Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_records, container, false);

        ArrayList<ObjectClass> mArrayList = new ArrayList<>();
        mArrayList.add(new ObjectClass("The Top Ten", "Pader Zane", "21/03/2021", "Rs.500/-", R.drawable.topten,"Top Ten is set to be released on 3 October 2017. Top Ten is exactly what is sounds like—a nostalgic recap of a four year friendship told in a top ten list format. This story is realistic and contains two opposite main characters"));
        mArrayList.add(new ObjectClass("The Hobbit", "JRR Tolkein", "25/03/2021", "Rs.250/-", R.drawable.hobbit,"The Hobbit, or There and Back Again is a children's fantasy novel by English author J. R. R. Tolkien. It was published on 21 September 1937 to wide critical acclaim, being nominated for the Carnegie Medal and awarded a prize from the New York Herald Tribune for best juvenile fiction."));
        mArrayList.add(new ObjectClass("Lord Of the Rings", "JRR Tolkein", "23/03/2021", "Rs.300/-", R.drawable.lord,"The Lord of the Rings is an epic high fantasy novel by the English author and scholar J. R. R. Tolkien. Set in Middle-earth, the world at some distant time in the past, the story began as a sequel to Tolkien's 1937 children's book"));
        mArrayList.add(new ObjectClass("Secret Library", "Oliver TearLay", "25/03/2021", "Rs.600/-", R.drawable.secret_library,"The Secret Library brings these little-known stories to light, exploring the intersections between books of all kinds and the history of the Western world over 3,000 years."));
        mArrayList.add(new ObjectClass("Harry Potter", "JK Rollings", "17/03/2021", "Rs.1000/-", R.drawable.harry_potter,"Harry Potter is a series of seven fantasy novels written by British author, J. K. Rowling. The novels chronicle the lives of a young wizard, Harry Potter, and his friends Hermione Granger and Ron Weasley, all of whom are students at Hogwarts School of Witchcraft and Wizardry."));
        mArrayList.add(new ObjectClass("Palace Of Illusions", "Chitra Banerjee", "21/03/2021", "Rs.400/-", R.drawable.illusions,"The Palace of Illusions is Draupadi's narration of the epic story of “Mahabharata”. It was very refreshing and invigorating to read the story from a female's POV."));
        mArrayList.add(new ObjectClass("All around the town", "Maryy Higgins", "17/03/2021", "Rs.2200/-", R.drawable.all_around_the_town,"Laurie Kenyon, a senior at Drew University, has an obsession - English professor Alan Grant, a married man. After watching him and writing him passionate love letters, Alan is found stabbed to death."));
        mArrayList.add(new ObjectClass("How to be famous", "Caitlin Moran", "23/03/2021", "Rs.300/-", R.drawable.famous,"How to Be Famous: A Novel Paperback – July 2, 2019. Find all the books, read about the author, and more. Johanna Morrigan (aka Dolly Wilde) has it all: she is nineteen, lives in her own flat in London, and writes for the coolest music magazine in Britain."));

        recyclerView = v.findViewById(R.id._recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new Adapter(mArrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return v;

    }
}