    package com.example.myappchat.ui.screen.profile

    import android.os.Bundle
    import androidx.fragment.app.Fragment
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.Toast
    import androidx.appcompat.app.AppCompatActivity
    import com.example.myappchat.R
    import com.example.myappchat.utils.ToolbarUtils

    class ProfileFragment : Fragment(){
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.fragment_profile, container, false)
        }

    }
