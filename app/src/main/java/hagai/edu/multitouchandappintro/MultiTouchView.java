package hagai.edu.multitouchandappintro;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.HashMap;

/**
 * Dispaly multiple finger pointers on the view as Circles
 */

public class MultiTouchView extends View {

    //constructor
    public MultiTouchView(Context context) {
        super(context, null);
    }

    public MultiTouchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public MultiTouchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private int pointerCircleSize = 60;
    private Paint mPaint;
    private int[] colors = {
            Color.BLACK,
            Color.BLUE,
            Color.GREEN,
            Color.MAGENTA,
            Color.YELLOW,
            Color.RED,
            Color.CYAN,
            Color.GRAY,
            Color.DKGRAY,
            Color.LTGRAY
    };

    private HashMap<Integer, PointF> mActivePointers;

    //A Funnel point for all the constructors
    private void init() {
        mActivePointers = new HashMap<>();//TODO: Better performance...
        //InteliJ suggests using a sparseArray instead.

        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setAntiAlias(true);

    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        //x,y & action
        int actionMasked = e.getActionMasked();
        switch (actionMasked) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_POINTER_DOWN:
                //code here
                break;

            case MotionEvent.ACTION_MOVE:
                //for loop over the fingers
                break;

            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_POINTER_UP:
                break;
        }

        return true;
    }
}
