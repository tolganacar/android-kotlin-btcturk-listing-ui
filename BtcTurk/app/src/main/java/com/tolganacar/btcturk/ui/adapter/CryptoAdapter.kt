package com.tolganacar.btcturk.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tolganacar.btcturk.R
import com.tolganacar.btcturk.data.entity.Crypto
import com.tolganacar.btcturk.databinding.CryptoItemBinding

class CryptoAdapter(var mContext: Context, var cryptoList: List<Crypto>) :
    RecyclerView.Adapter<CryptoAdapter.CryptoViewHolder>() {
    inner class CryptoViewHolder(val binding: CryptoItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoViewHolder {
        val binding = CryptoItemBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CryptoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CryptoViewHolder, position: Int) {
        val crypto = cryptoList.get(position)
        val t = holder.binding

        t.textViewCryptoFullName.text = crypto.fullName
        t.textViewCryptoShortName.text = crypto.shortName
        t.textViewPrice.text = crypto.price
        t.textViewVolume.text = crypto.volume
        t.textViewVolumeShortName.text = crypto.shortName
        t.priceChart.setImageResource(mContext.resources.getIdentifier(crypto.lineChart,"drawable",mContext.packageName))

        if(crypto.change.startsWith("+")){
            t.textViewChange.text = crypto.change.drop(1)
            t.cardViewChange.setCardBackgroundColor(mContext.getColor(R.color.cardViewChangeGreenColor))
        } else if (crypto.change.startsWith("-")) {
            t.textViewChange.text = crypto.change.drop(1)
            t.cardViewChange.setCardBackgroundColor(mContext.getColor(R.color.cardViewChangeRedColor))
        }
    }

    override fun getItemCount(): Int {
        return cryptoList.size
    }
}