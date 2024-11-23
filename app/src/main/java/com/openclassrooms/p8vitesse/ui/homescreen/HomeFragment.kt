package com.openclassrooms.p8vitesse.ui.homescreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.openclassrooms.p8vitesse.R
import com.openclassrooms.p8vitesse.databinding.FragmentHomeBinding
import com.openclassrooms.p8vitesse.ui.addscreen.AddFragment


class HomeFragment : Fragment() {

    // Créer une instance de ViewBinding
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Initialiser ViewBinding
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Appeler la fonction pour configurer le TabLayout
        setupTabLayout()
        setupFloatingActionButton()
    }

    private fun setupFloatingActionButton() {
        binding.AddFAB.setOnClickListener {
            navigateToAddScreen()
        }
    }

    private fun navigateToAddScreen() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, AddFragment())
            .addToBackStack(null)
            .commit()
    }

    // Fonction pour configurer le TabLayout
    private fun setupTabLayout() {
        // Setup TabLayout with custom tabs
        binding.homeScreenTabLayout.addTab(
            binding.homeScreenTabLayout.newTab()
                .setText("All")
        )
        binding.homeScreenTabLayout.addTab(
            binding.homeScreenTabLayout.newTab()
                .setText("Favorites")
        )

        // Set a listener for tab selection
        binding.homeScreenTabLayout.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    // "All" tab selected
                    0 -> {
//                        isFavoritesTabSelected = false
//                        viewModel.fetchCandidates(favorite = false, currentQuery)
                    }
                    // "Favorites" tab selected
                    1 -> {
//                        isFavoritesTabSelected = true
//                        viewModel.fetchCandidates(favorite = true, currentQuery)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Libérer la référence à _binding pour éviter les fuites de mémoire
        _binding = null
    }
}