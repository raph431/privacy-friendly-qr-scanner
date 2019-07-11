package com.secuso.privacyFriendlyCodeScanner.qrscanner.resultfragments;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.secuso.privacyFriendlyCodeScanner.qrscanner.R;

public class TextResultFragment extends ResultFragment {

    public TextResultFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = super.onCreateView(inflater, container, savedInstanceState);

        TextView tv = v.findViewById(R.id.result_field_text);
        tv.setText(qrCodeString);

        return v;
    }

    public void onProceedPressed(Context context, String content) {
        Uri uri = Uri.parse("http://www.google.com/#q="+content);
        Intent search = new Intent(Intent.ACTION_VIEW, uri);
        String caption = getResources().getStringArray(R.array.text_array)[0];
        startActivity(Intent.createChooser(search, caption));
    }
}
