package com.app.androidprojectfragmentkotlin.fragments

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.app.androidprojectfragmentkotlin.R
import com.app.androidprojectfragmentkotlin.databinding.FragmentSignUpBinding
import java.util.regex.Pattern


class SignUpFragment : Fragment() {

    private val REGEX = ("^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$")

    private lateinit var binding:FragmentSignUpBinding
    private var gender = ""
    private var isChecked = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.chkTerms.setOnCheckedChangeListener { compoundButton, status ->
            isChecked = status
        }

        binding.rgGender.setOnCheckedChangeListener { radioGroup, i ->

            when(i){
                R.id.rb_male -> gender = "Male"
                R.id.rb_female -> gender = "Female"
                R.id.rb_other -> gender = "Others"
            }
            //Toast.makeText(requireActivity(), "$i", Toast.LENGTH_SHORT).show()

        }

        binding.btnRegister.setOnClickListener {

            var name = binding.etName.text.toString().trim()
            var contact = binding.etContact.text.toString().trim()
            var email = binding.etEmail.text.toString().trim()
            var password = binding.etPassword.text.toString().trim()

            resetFocus()

            if(name.isEmpty()){
                // show error
                setError(binding.etName, "Enter your name")
                //binding.etName.error = "Enter your name"
            }else if(!isValidContact(contact)){
                setError(binding.etContact, "Enter valid contact number")
                //binding.etContact.error = "Enter valid contact number"
            }else if(!isValidEmail(email)){
                setError(binding.etEmail, "Enter valid email address")
                //binding.etEmail.error = "Enter valid email address"
            }else if(!isValidPassword(password)) {
                setError(binding.etPassword, "Enter valid password")
                //binding.etPassword.error = "Enter valid password"
            }else if(gender.isEmpty()){
                setError(null, "Select you gender")
                //Toast.makeText(requireActivity(), "Select you gender", Toast.LENGTH_SHORT).show()
            }else if(!isChecked){
                setError(null, "Please select terms and conditions")
                //Toast.makeText(requireActivity(), "Please select terms and conditions", Toast.LENGTH_SHORT).show()
            }else{
                // navigate to home
                Toast.makeText(requireActivity(), "All fields are validated", Toast.LENGTH_SHORT).show()
            }

        }


    }

    private fun resetFocus() {
        binding.etName.background =  ContextCompat.getDrawable(requireActivity(), R.drawable.et_background)
        binding.etContact.background =  ContextCompat.getDrawable(requireActivity(), R.drawable.et_background)
        binding.etEmail.background =  ContextCompat.getDrawable(requireActivity(), R.drawable.et_background)
        binding.etPassword.background =  ContextCompat.getDrawable(requireActivity(), R.drawable.et_background)

        binding.etPassword.clearFocus()
        binding.etName.clearFocus()
        binding.etEmail.clearFocus()
        binding.etContact.clearFocus()

    }

    private fun setError(editText: EditText?, message: String) {

        editText?.let {
            it.background = ContextCompat.getDrawable(requireActivity(), R.drawable.et_background_error)
            it.requestFocus()
        }
        Toast.makeText(requireActivity(), message, Toast.LENGTH_SHORT).show()
    }

    private fun isValidContact(contact:String):Boolean
    {
        return contact.length==10
    }

    private fun isValidEmail(email:String):Boolean{
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isValidPassword(password:String) : Boolean{
        return Pattern.compile(REGEX).matcher(password).matches()
    }


}