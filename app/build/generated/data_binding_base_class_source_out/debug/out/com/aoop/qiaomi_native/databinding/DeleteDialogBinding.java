// Generated by view binder compiler. Do not edit!
package com.aoop.qiaomi_native.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aoop.qiaomi_native.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DeleteDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView cancel;

  @NonNull
  public final TextView delete;

  @NonNull
  public final TextView everyone;

  private DeleteDialogBinding(@NonNull LinearLayout rootView, @NonNull TextView cancel,
      @NonNull TextView delete, @NonNull TextView everyone) {
    this.rootView = rootView;
    this.cancel = cancel;
    this.delete = delete;
    this.everyone = everyone;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DeleteDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DeleteDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.delete_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DeleteDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel;
      TextView cancel = ViewBindings.findChildViewById(rootView, id);
      if (cancel == null) {
        break missingId;
      }

      id = R.id.delete;
      TextView delete = ViewBindings.findChildViewById(rootView, id);
      if (delete == null) {
        break missingId;
      }

      id = R.id.everyone;
      TextView everyone = ViewBindings.findChildViewById(rootView, id);
      if (everyone == null) {
        break missingId;
      }

      return new DeleteDialogBinding((LinearLayout) rootView, cancel, delete, everyone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
