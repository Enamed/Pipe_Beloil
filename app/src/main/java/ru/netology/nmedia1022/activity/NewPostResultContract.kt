package ru.netology.nmedia1022.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import ru.netology.nmedia1022.fragment.NewPostFragment

class NewPostResultContract : ActivityResultContract<Unit, String?>(){
    override fun createIntent(context: Context, input: Unit): Intent =
        Intent(context, NewPostFragment::class.java)


    override fun parseResult(resultCode: Int, intent: Intent?): String? =
        if (resultCode == Activity.RESULT_OK) {
            intent?.getStringExtra(Intent.EXTRA_TEXT)
        }else {
            null
        }


}

