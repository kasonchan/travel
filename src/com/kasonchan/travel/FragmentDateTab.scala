package com.kasonchan.travel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.app.Fragment

class FragmentDateTab extends Fragment {
  override def onCreateView(inflater: LayoutInflater, container: ViewGroup,
    savedInstanceState: Bundle): View = {
    val rootView: View = inflater.inflate(R.layout.layout_date, container, false)
    rootView
  }
}