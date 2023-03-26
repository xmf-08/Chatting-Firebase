package xmf.developer.telegrampremium.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.database.*
import xmf.developer.telegrampremium.R
import xmf.developer.telegrampremium.adapters.MyRvAdapter
import xmf.developer.telegrampremium.databinding.FragmentUsersBinding
import xmf.developer.telegrampremium.models.MyShablon

class UsersFragment : Fragment() {
    private val binding by lazy {FragmentUsersBinding.inflate(layoutInflater)}
    private lateinit var database: FirebaseDatabase
    private lateinit var reference: DatabaseReference
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        database = FirebaseDatabase.getInstance()
        reference = database.getReference("users")

        reference.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val list = ArrayList<MyShablon>()
                val children = snapshot.children
                for (child in children){
                    val user = child.getValue(MyShablon::class.java)
                    if (user!=null){
                        list.add(user)
                    }
                }
               val myRvAdapter = MyRvAdapter(list)
                binding.myRv.adapter = myRvAdapter
            }

            override fun onCancelled(error: DatabaseError) {

            }
        })
        return binding.root
     }
}