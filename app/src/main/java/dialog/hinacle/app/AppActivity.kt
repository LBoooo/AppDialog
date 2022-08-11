package dialog.hinacle.app

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.hinacle.app.databinding.LayoutTestBinding
import com.hinacle.app.R
import com.hinacle.appdialog.extensions.bindingListenerFun
import com.hinacle.appdialog.extensions.newAppDialog

class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        newAppDialog {
            layoutId = R.layout.layout_test
            unLeak = true
            bindingListenerFun("", LayoutTestBinding::class){
                dialogBinding, dialog ->

            }
        }.showNowOnWindow(supportFragmentManager , tag = "")

    }
}