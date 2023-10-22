package com.example.navigationcomponenttutorial

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FirstFragment : Fragment() {

    /*
    Primer método antes de crear el Fragmento.
    Interesante para recoger el contexto (referencia del Activity)
     */
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    /*
    Crea el Fragmento. Inicializamos en su caso, componentes.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    /*
    Método que crea la UI de nuestro Fragmento. Montamos un View, que
    será la base de una jerarquía de Views para este Fragmento.
    container de tipo ViewGroup, será donde insertaremos nuestra View con
    la jerarquía de  Views de este fragmento. container vendrá del Activity.
    El tercer atributo es false, porque agrandamos la jerarquía de Views con la
    que creará el Fragment.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


}