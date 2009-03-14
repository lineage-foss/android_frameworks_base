package com.tmobile.widget;

import com.android.internal.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class SectionHeaderLabel extends TextView {

	public SectionHeaderLabel(Context context) {
		this(context, null);
	}

	public SectionHeaderLabel(Context context, AttributeSet attrs) {
		this(context, attrs, R.attr.sectionHeaderLayoutLabel);
	}
	
	public SectionHeaderLabel(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
				
		TypedArray a = 
            context.obtainStyledAttributes(attrs, R.styleable.HeaderLayout, defStyle, 0);

		String headerText = a.getString(R.styleable.HeaderLayout_headerText);
        if (headerText != null) {
        	setText(headerText);
        }
        a.recycle();
	}

	public CharSequence getHeaderText() {
		return getText();
	}
	
	public void setHeaderText(CharSequence text) {
		setText(text);
	}
	
}
