package xmf.developer.telegrampremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xmf.developer.telegrampremium.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}