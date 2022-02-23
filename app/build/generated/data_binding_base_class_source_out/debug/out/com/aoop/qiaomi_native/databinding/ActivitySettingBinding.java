// Generated by view binder compiler. Do not edit!
package com.aoop.qiaomi_native.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aoop.qiaomi_native.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final EditText editUserName;

  @NonNull
  public final ImageView plus;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final AppCompatButton saveButon;

  private ActivitySettingBinding(@NonNull RelativeLayout rootView, @NonNull ImageView backArrow,
      @NonNull EditText editUserName, @NonNull ImageView plus,
      @NonNull CircleImageView profileImage, @NonNull AppCompatButton saveButon) {
    this.rootView = rootView;
    this.backArrow = backArrow;
    this.editUserName = editUserName;
    this.plus = plus;
    this.profileImage = profileImage;
    this.saveButon = saveButon;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_setting, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backArrow;
      ImageView backArrow = ViewBindings.findChildViewById(rootView, id);
      if (backArrow == null) {
        break missingId;
      }

      id = R.id.editUserName;
      EditText editUserName = ViewBindings.findChildViewById(rootView, id);
      if (editUserName == null) {
        break missingId;
      }

      id = R.id.plus;
      ImageView plus = ViewBindings.findChildViewById(rootView, id);
      if (plus == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.saveButon;
      AppCompatButton saveButon = ViewBindings.findChildViewById(rootView, id);
      if (saveButon == null) {
        break missingId;
      }

      return new ActivitySettingBinding((RelativeLayout) rootView, backArrow, editUserName, plus,
          profileImage, saveButon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
