<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
xmlns:android="http://schemas.android.com/apk/res/android"
android:orientation="vertical"
android:gravity="center"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:background="#071326"
android:padding="32dp">

<ImageView
android:layout_width="150dp"
android:layout_height="150dp"
android:src="@drawable/logo_nazasul"
android:layout_marginBottom="24dp"/>

<EditText
android:id="@+id/editUsername"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Usuário"
android:drawableStart="@drawable/ic_user"
android:padding="10dp"
android:textColorHint="#999"
android:backgroundTint="#fff"/>

<EditText
android:id="@+id/editPassword"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Senha"
android:drawableStart="@drawable/ic_lock"
android:inputType="textPassword"
android:padding="10dp"
android:textColorHint="#999"
android:layout_marginTop="8dp"
android:backgroundTint="#fff"/>

<Button
android:id="@+id/btnLogin"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="ENTRAR"
android:backgroundTint="#F45B1F"
android:textColor="#fff"
android:layout_marginTop="16dp"/>

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Esqueceu sua senha?"
android:textColor="#ccc"
android:layout_marginTop="8dp"/>

<TextView
android:id="@+id/txtGoToRegister"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Ainda não possui cadastro? Cadastre-se"
android:textColor="#ccc"
android:layout_marginTop="16dp"/>
</LinearLayout>
