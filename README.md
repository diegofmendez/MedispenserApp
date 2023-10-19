# MedispenserApp
Programa de uso de Medispenser para escritorio

# Equipo
- Gabriella Ballesteros
- Diego Mendez

# ¿Qué es medispenser?
Medispenser es un dispensador de medicamentos vinculado a una applicacion para escritorio, esta app permite al usuario ingresar los nombres de los medicamentos, los tiempos de administración de cada uno, y notifica al usuario cuando es necesario reabastecer y limpiar ciertos compartimientos.

# con que trabajamos
- Netbeans
- Arduino
- MySQL

# Código arduino
#include <Servo.h>
Servo servo1;

int mensaje;



void setup() {

  servo1.attach(3);

  Serial.begin(9600);



}



void loop() {

if(Serial.available()>0){

  mensaje = Serial.read();

  if(mensaje=='1'){

    servo1.write(90);

    delay(1000);

    servo1.write(0);

    delay(1000);

    servo1.write(90);

    delay(1000);

    }

  }

}

