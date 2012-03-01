package com.application.sudoku;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

/**
 * The dialog allows selection of numbers 1 - 9 and Unset value.
 *
 * @author Pavel Novák
 */

public class NumberSelectDialog extends Dialog implements OnClickListener {
	
    private TableLayout layout;
    private int selectedValue;
    private final String UNSET = "Unset";
    private final String DIALOG_TITLE = "Select number";

    
    public NumberSelectDialog(Context context) {
        super(context);
        setTitle(DIALOG_TITLE);
        //setting of table layout
        layout = new TableLayout(this.getContext());
        layout.setPadding(1,1,1,1);
        layout.setStretchAllColumns(true);
        insertButtons();
        setContentView(layout);
    }
    
    
    private void insertButtons() {
        TableRow tableRow;
        int value = 1;
        //adding 1 - 9 buttons to layout
        for (int i = 0; i < 3; i++) {
            tableRow = new TableRow(this.getContext());
            for (int j = 0; j < 3; j++) {
                Button bt = new Button(this.getContext());
                bt.setText(Integer.toString(value++));
                bt.setOnClickListener(this);

                tableRow.addView(bt);
            }
            layout.addView(tableRow);
        }
        tableRow = new TableRow(this.getContext());
        Button bt = new Button(this.getContext());
        bt.setText(UNSET);
        bt.setOnClickListener(this);
        tableRow.addView(bt);
        layout.addView(tableRow);
        //set layout span to 3 on "unset" button
        TableRow.LayoutParams params = (TableRow.LayoutParams)bt.getLayoutParams();
        params.span = 3;
        bt.setLayoutParams(params);
    }

    public void onClick(View view) {
        String buttonText = (String) ((Button)view).getText();
        
        
        if(buttonText.equals(UNSET))
            selectedValue = 0;
        else
            selectedValue = Integer.parseInt(buttonText);
        this.dismiss();
    }
    
    public int getSelectedValue() {
        return this.selectedValue;
    }
}
