package com.l4digital.fastscroll;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * An Annotation Interface defining the constant values for different indexing methods that can be used to calculate the position of the item to obtain the selection text from.
 */
@Retention(RetentionPolicy.SOURCE)
@IntDef(value = { IndexingMethod.PROPORTIONAL, IndexingMethod.FIRST_VISIBLE_ITEM, IndexingMethod.LAST_VISIBLE_ITEM })
@SuppressWarnings("unused")
public @interface IndexingMethod {

    int PROPORTIONAL = 0;

    int FIRST_VISIBLE_ITEM = 1;

    int LAST_VISIBLE_ITEM = 2;

}
