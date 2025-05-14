<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
android:background="#071326"
android:layout_width="match_parent"
android:layout_height="match_parent">

<LinearLayout
android:orientation="vertical"
android:padding="24dp"
android:layout_width="match_parent"
android:layout_height="wrap_content">

<TextView
android:text="Olá, Mário Luiz Guimarães"
android:textColor="#fff"
android:textSize="18sp"/>

<TextView
android:text="Destaques"
android:textColor="#F45B1F"
android:textStyle="bold"
android:textSize="16sp"
android:layout_marginTop="16dp"/>

<View
android:layout_width="match_parent"
android:layout_height="160dp"
android:background="#2A2A2A"
android:layout_marginTop="8dp"/>

<LinearLayout
android:orientation="horizontal"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:gravity="center"
android:layout_marginTop="16dp">

<ImageView android:layout_width="48dp" android:layout_height="48dp" android:background="#2A2A2A"/>
<ImageView android:layout_width="48dp" android:layout_height="48dp" android:layout_marginStart="16dp" android:background="#2A2A2A"/>
<ImageView android:layout_width="48dp" android:layout_height="48dp" android:layout_marginStart="16dp" android:background="#2A2A2A"/>
<ImageView android:layout_width="48dp" android:layout_height="48dp" android:layout_marginStart="16dp" android:background="#2A2A2A"/>
</LinearLayout>

<TextView android:text="Culto De Domingo" android:textColor="#fff" android:layout_marginTop="24dp"/>
<Button android:text="Acessar" android:backgroundTint="#F45B1F" android:textColor="#fff"/>

<TextView android:text="Ver todos" android:textColor="#F45B1F" android:gravity="end" android:layout_marginTop="16dp"/>
</LinearLayout>
</ScrollView>
