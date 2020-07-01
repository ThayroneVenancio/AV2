package com.example.crudusuario;


import android.content.Intent;
import android.view.View;

import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static java.util.regex.Pattern.matches;

@RunWith(AndroidJUnit4.class)
public class Tela_Test_Espresso_e_Intents {

    @Rule
    public ActivityTestRule<TelaAutenticacao>
            mActivityRule = new ActivityTestRule<>(TelaAutenticacao.class, false, true);



    @Test
    public void test_De_Verificacao_Conteudo_Text_UsuarioAut() {
        testEmptyFieldState(R.id.txtUsuarioAut);
    }


    @Test
    public void test_De_Verificacao_Conteudo_Text_SenhaAut() {
        testEmptyFieldState(R.id.txtSenhaAut);
    }

    private void testEmptyFieldState(int txtSenhaAut) {
    }

    @Rule
    public IntentsTestRule<MenuPrincipal> intentsTestRule =
            new IntentsTestRule<>(MenuPrincipal.class);


    @Test
    public void testeValidandoPerformaceIntents() {
        onView(withId(R.id.btUsuarioMenu)).perform(click());
    }

//TESTE JENKINS teste
}
