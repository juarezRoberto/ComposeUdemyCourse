package com.juar3z.composeudemycourse.ui.auth.login

import android.util.Patterns
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class LoginViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    fun onEmailChange(email: String) {
        _uiState.update { it.copy(email = email, isLoginEnabled = isLoginEnabled()) }
    }

    fun onPasswordChange(password: String) {
        _uiState.update { it.copy(password = password, isLoginEnabled = isLoginEnabled()) }
    }

    fun isLoginEnabled(): Boolean {
        val isEmailValid = Patterns.EMAIL_ADDRESS.matcher(_uiState.value.email).matches()
        val isPasswordValid = _uiState.value.password.length >= 6
        return isEmailValid && isPasswordValid
    }
}

data class LoginUiState(
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val isLoginEnabled: Boolean = false,
)