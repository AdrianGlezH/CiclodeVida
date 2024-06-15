Aplicacion que saca por Logcat los mensajes según el ciclo de vida de la Activity.

1.onCreate: Se llama cuando la actividad se crea por primera vez.

2.onStart: Se llama cuando la actividad está a punto de hacerse visible.

3.onResume: Se llama cuando la actividad ha comenzado a interactuar con el usuario.

4.onPause: Se llama cuando la actividad ya no está en primer plano.

5.onStop: Se llama cuando la actividad ya no es visible.

6.onDestroy: Se llama antes de que la actividad sea destruida.

Para comprobar que la aplicacion funciona debemos de ejecutar ña aplicacion en un dispositivo real o en el emulador, después abrir el Logcat en AndroidStudio y filtrar los mensajes con la etiqueta CiclodeVida.

