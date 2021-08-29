package com.example.criminalintent

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders


private const val TAG = "CrimeListFragment"

class CrimeListFragment : Fragment() {
    private val crimeListViewModel: CrimeListViewModel by lazy {
        ViewModelProviders.of(this).get(CrimeListViewModel::class.java)
    }
}