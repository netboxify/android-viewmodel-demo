package i.xxxx.viewmodel_demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainActivityViewModel() : BaseViewModel() {

    private val _isDarkTheme = MutableLiveData<Boolean>(true)
    val isDarkTheme: LiveData<Boolean>
        get() = _isDarkTheme

    override fun changeColor() {
        _isDarkTheme.value = !_isDarkTheme.value!!
    }
}
