package com.example.myandroidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // יצירת ממשק פשוט ישירות מהקוד בלי קבצי עיצוב מסובכים
        android.widget.LinearLayout layout = new android.widget.LinearLayout(this);
        layout.setOrientation(android.widget.LinearLayout.VERTICAL);
        layout.setPadding(30, 30, 30, 30);

        TextView title = new TextView(this);
        title.setText("מידע על ג'קי צ'אן");
        title.setTextSize(24);
        title.setGravity(android.view.Gravity.CENTER);
        layout.addView(title);

        final TextView infoText = new TextView(this);
        infoText.setText("לחץ על הכפתורים למטה כדי לקרוא מידע");
        infoText.setTextSize(18);
        infoText.setPadding(0, 40, 0, 40);
        layout.addView(infoText);

        Button btnBio = new Button(this);
        btnBio.setText("ביוגרפיה");
        btnBio.setOnClickListener(v -> infoText.setText("ג'קי צ'אן נולד בשנת 1954 בהונג קונג. הוא שחקן, פעלולן, ואמן לחימה מפורסם בעולם כולו."));
        layout.addView(btnBio);

        Button btnMovies = new Button(this);
        btnMovies.setText("סרטים מובילים");
        btnMovies.setOnClickListener(v -> infoText.setText("סרטיו הבולטים ביותר הם: 'שעת שיא', 'סיפור שוטר', ו'שנחאי נון'."));
        layout.addView(btnMovies);

        Button btnSkills = new Button(this);
        btnSkills.setText("אומנויות לחימה");
        btnSkills.setOnClickListener(v -> infoText.setText("ג'קי ידוע בכך שהוא מבצע את כל הפעלולים המטורפים שלו בעצמו, בלי כפילים, בשילוב קומדיה."));
        layout.addView(btnSkills);

        setContentView(layout);
    }
}
