package com.example.crudusuario;


import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class TelaAutenticacaoTest {

    @Rule
    public ActivityTestRule<TelaAutenticacao>
            mActivityRule = new ActivityTestRule<>(TelaAutenticacao.class, false, true);


    @Test
    public void teste_Click_Botao_Autenticacao() {
        onView(withId(R.id.btEntrarAut)).perform(click());
    }

    @Test
    public void whenUserNameIsEmpty_andClickOnLoginButton_shouldDisplayDialog() {
        testEmptyFieldState(R.id.txtSenhaAut);
    }

    private void testEmptyFieldState(int txtSenhaAut) {
    }


}
