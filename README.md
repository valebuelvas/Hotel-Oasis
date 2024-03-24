# Hotel-Oasis
Suposiciones

Este proyecto consiste en desarrollar el mecanismo de un hotel que permita asignar habitaciones, y su correspondiente facturación, para los huéspedes del hotel, los cuales, en este caso, son jugadores de un equipo de fútbol.

Para esto, por un lado se creó una clase Persona de la cual heredan las clases Recepcionista y Jugador.

Por otro lado se crearon las clases Habitación y Factura para dar más detalle de las especificaciones del hotel.

También se tiene la clase Equipo, en la cual se desarrolla gran parte del código del proyecto porque en esta es donde se asigna cada jugador al equipo y donde se asignan también las habitaciones y las facturas 

En este caso, las habitaciones del hotel son todas iguales y cuentan con el mismo precio ($500.000) el cual se cobra por cada jugador, asumiendo que todos duermen en habitaciones separadas, además, por cada equipo se cobra un excedente del 20% del total de las habitaciones que vendría siendo el servicio extra por hospedarse, y la suma de estos dos montos es lo que debe pagar en total cada equipo.

Luego de que se asignan las habitaciones de cada jugador y se registran el o los equipos, entonces el recepcionista puede hacer el chequeo de las habitaciones ocupadas y disponibles y el chequeo del dinero recaudado en el día correspondiente a la factura de cada equipo registrado.

Además, cabe destacar que también se hizo uso de una clase Lectura, similar a la desarrollada en ejercicios de clase que simplifica el código que se requiere cuando se lee el valor de una variable por consola, sin embargo, esta clase no es representada en el diagrama de clases porque es independiente al contexto del ejercicio y su uso no es obligatorio.
