package ru.myitschool.lab23;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    // XML types of data
    private View writeInternal;
    private View writeExternal;
    private TextView fileContent;
    private EditText wordsInput;
    private Calendar month = new GregorianCalendar();
    private File filesDirectory;

    // Classical types of data
    private String[] words = new String[10000];

    private static final String MY_TAG = "MY_TAG";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        writeInternal = findViewById(R.id.write_internal);
        writeExternal = findViewById(R.id.write_external);
        fileContent = findViewById(R.id.file_content);
        wordsInput = findViewById(R.id.words_input);

        writeInternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creatingFolder();
                try {
                    copingFile();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private void creatingFolder() {
        try {
            filesDirectory = new File("files/" + month.get(Calendar.MONTH) + "/words.txt");
            filesDirectory.mkdir();
        } catch (NullPointerException e) {
            Log.e(MY_TAG, e.getMessage());
        }
    }

    public void copingFile() throws FileNotFoundException {
        words = wordsInput.getText().toString().split(",");
        Context context = getApplicationContext();

        File filePath = new File(context.getFilesDir().getPath() + "/" + month.get(Calendar.MONTH) + "/words.txt");
        Log.i(MY_TAG, context.getFilesDir().getPath());
        try {
            filePath.createNewFile();
            PrintWriter pw = new PrintWriter(new FileWriter(filePath));
            for (int i = 0; i < words.length; i++) {
                pw.print(words[i] + "\n");
            }
        } catch (FileNotFoundException e) {
            Log.e(MY_TAG, e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
