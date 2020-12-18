package android.support.design.widget;

import android.content.Context;
import android.support.p011v7.widget.C0878q;
import android.support.p011v7.widget.C0905vb;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class TextInputEditText extends C0878q {
    public TextInputEditText(Context context) {
        super(context);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof C0905vb) {
                    editorInfo.hintText = ((C0905vb) parent).getHint();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return onCreateInputConnection;
    }
}
