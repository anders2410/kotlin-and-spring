package com.example.demo.datasource

import com.example.demo.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}