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
android:id="@+id/editFullName"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Nome completo"
android:drawableStart="@drawable/ic_user"
android:padding="10dp"
android:textColorHint="#999"
android:backgroundTint="#fff"/>

<EditText
android:id="@+id/editEmail"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Email"
android:drawableStart="@drawable/ic_email"
android:padding="10dp"
android:textColorHint="#999"
android:layout_marginTop="8dp"
android:backgroundTint="#fff"/>

<EditText
android:id="@+id/editNewPassword"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Escolha uma senha"
android:drawableStart="@drawable/ic_lock"
android:inputType="textPassword"
android:padding="10dp"
android:textColorHint="#999"
android:layout_marginTop="8dp"
android:backgroundTint="#fff"/>

<Button
android:id="@+id/btnRegister"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="ENTRAR"
android:backgroundTint="#F45B1F"
android:textColor="#fff"
android:layout_marginTop="16dp"/>

<TextView
android:id="@+id/txtGoToLogin"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Já possui cadastro? Entrar"
android:textColor="#ccc"
android:layout_marginTop="16dp"/>
</LinearLayout>
