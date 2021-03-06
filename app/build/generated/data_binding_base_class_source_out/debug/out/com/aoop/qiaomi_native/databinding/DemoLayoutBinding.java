// Generated by view binder compiler. Do not edit!
package com.aoop.qiaomi_native.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aoop.qiaomi_native.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DemoLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final View view3;

  @NonNull
  public final View view4;

  @NonNull
  public final View view5;

  private DemoLayoutBinding(@NonNull LinearLayout rootView, @NonNull View view3,
      @NonNull View view4, @NonNull View view5) {
    this.rootView = rootView;
    this.view3 = view3;
    this.view4 = view4;
    this.view5 = view5;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DemoLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DemoLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.demo_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DemoLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.view3;
      View view3 = ViewBindings.findChildViewById(rootView, id);
      if (view3 == null) {
        break missingId;
      }

      id = R.id.view4;
      View view4 = ViewBindings.findChildViewById(rootView, id);
      if (view4 == null) {
        break missingId;
      }

      id = R.id.view5;
      View view5 = ViewBindings.findChildViewById(rootView, id);
      if (view5 == null) {
        break missingId;
      }

      return new DemoLayoutBinding((LinearLayout) rootView, view3, view4, view5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
