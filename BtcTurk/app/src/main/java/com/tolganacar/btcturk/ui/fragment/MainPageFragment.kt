package com.tolganacar.btcturk.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tolganacar.btcturk.data.entity.Crypto
import com.tolganacar.btcturk.databinding.FragmentMainPageBinding
import com.tolganacar.btcturk.ui.adapter.CryptoAdapter

class MainPageFragment : Fragment() {
    private lateinit var binding: FragmentMainPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)

        val cryptoList = ArrayList<Crypto>()
        val cryptoBtc = Crypto(1,"BTC","BITCOIN","62,102","170","+%4.70", "btclinechart")
        val cryptoEth = Crypto(2,"ETH","ETHEREUM","3,423","1,554","+%2.52", "ethlinechart")
        val cryptoDoge = Crypto(3,"DOGE","DOGECOIN","0.12204","27,350,330","-%1.37", "dogelinechart")
        val cryptoSol = Crypto(4,"SOL","SOLANA","134.24","86,585","+%4.63", "sollinechart")
        val cryptoXrp = Crypto(5,"XRP","RIPPLE","0.5927","11,713,051","-%0.05", "xrplinechart")
        val cryptoAda = Crypto(6,"ADA","CARDANO","0.6780","1,605,427","-%1.19", "adalinechart")
        val cryptoArb = Crypto(7,"ARB","ARBITRUM","1.9915","1,318,665","+%0.39", "arblinechart")
        val cryptoShib = Crypto(8,"SHIB","SHIBA INU","0.00001299","391,557,882,512","-%1.14", "shiblinechart")
        val cryptoRndr = Crypto(9,"RNDR","RENDER TOKEN","7.64","401,125","+%5,12", "rndrlinechart")
        val cryptoFet = Crypto(10,"FET","FETCH.AI","1.64821","4,077,744","+%19.44", "fetlinechart")
        val cryptoAgix = Crypto(11,"AGIX","SINGULARITYNET","0.8398","3,929,066","+%14.57", "agixlinechart")
        val cryptoApt = Crypto(12,"APT","APTOS","11.68 ","129,209","-%3.07", "aptlinechart")
        val cryptoFloki = Crypto(13,"FLOKI","FLOKI","0.00005765","15,546,306,671","+%6.88", "flokilinechart")
        val cryptoInj = Crypto(14,"INJ","INJECTIVE","43.001","20,638","-%1.55", "injlinechart")
        val cryptoMatic = Crypto(15,"MATIC","POLYGON","1.0155","745,871","-%2.82", "maticlinechart")
        val cryptoLink = Crypto(16,"LINK","CHAINLINK","19.794","26,343","+%2.01", "linklinechart")
        val cryptoChz = Crypto(17,"CHZ","CHILIZ","0.1585","6,335,572","+%9.69", "chzlinechart")
        val cryptoDot = Crypto(18,"DOT","POLKADOT","8.458","65,070","-%3.27", "dotlinechart")
        val cryptoMagic = Crypto(19,"MAGIC","MAGIC","1.2355","377,554","+%1.97", "magiclinechart")
        val cryptoAtom = Crypto(20,"ATOM","COSMOS","11.37","29.055","+%5.78", "atomlinechart")
        val cryptoCrv = Crypto(21,"CRV","CURVE DAO TOKEN","0,6089","267,802","-%3.52", "crvlinechart")
        val cryptoLdo = Crypto(22,"LDO","LIDO DAO","3.410","17,425","+%2.85", "ldolinechart")
        val cryptoImx = Crypto(23,"IMX","IMMUTABLE X","3.2028","31,401","-%5.20", "imxlinechart")
        val cryptoAave = Crypto(24,"AAVE","AAVE","108.50","2,198","-%0.55", "aavelinechart")
        val cryptoLtc = Crypto(25,"LTC","LITECOIN","84.39","4,100","-%2.79", "ltclinechart")
        cryptoList.add(cryptoBtc)
        cryptoList.add(cryptoEth)
        cryptoList.add(cryptoDoge)
        cryptoList.add(cryptoSol)
        cryptoList.add(cryptoXrp)
        cryptoList.add(cryptoAda)
        cryptoList.add(cryptoArb)
        cryptoList.add(cryptoShib)
        cryptoList.add(cryptoRndr)
        cryptoList.add(cryptoFet)
        cryptoList.add(cryptoAgix)
        cryptoList.add(cryptoApt)
        cryptoList.add(cryptoFloki)
        cryptoList.add(cryptoInj)
        cryptoList.add(cryptoMatic)
        cryptoList.add(cryptoLink)
        cryptoList.add(cryptoChz)
        cryptoList.add(cryptoDot)
        cryptoList.add(cryptoMagic)
        cryptoList.add(cryptoAtom)
        cryptoList.add(cryptoCrv)
        cryptoList.add(cryptoLdo)
        cryptoList.add(cryptoImx)
        cryptoList.add(cryptoAave)
        cryptoList.add(cryptoLtc)

        val cryptoAdapter = CryptoAdapter(requireContext(),cryptoList)
        binding.recyclerViewCrypto.adapter = cryptoAdapter

        binding.recyclerViewCrypto.layoutManager = LinearLayoutManager(requireContext())

        return binding.root
    }
}