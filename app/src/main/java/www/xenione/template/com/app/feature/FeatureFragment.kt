package www.xenione.template.com.app.feature

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import www.xenione.template.com.app.R

/**
 * Created by eugenisenent on 9/11/18.
 */

class FeatureFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.feature, container, false);
    }
}
